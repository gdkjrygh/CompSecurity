.class public Lcom/roidapp/photogrid/release/EffectsList;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/ListView;

.field private b:Z

.field private c:Lcom/roidapp/photogrid/common/al;

.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->a:Landroid/widget/ListView;

    .line 31
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->b:Z

    .line 107
    new-instance v0, Lcom/roidapp/photogrid/release/bd;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/bd;-><init>(Lcom/roidapp/photogrid/release/EffectsList;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->d:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 120
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 121
    iget-object v1, p0, Lcom/roidapp/photogrid/release/EffectsList;->u:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    .line 122
    iget-object v1, p0, Lcom/roidapp/photogrid/release/EffectsList;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 124
    :cond_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/EffectsList;->startActivity(Landroid/content/Intent;)V

    .line 125
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/EffectsList;->finish()V

    .line 126
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/EffectsList;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/EffectsList;->a()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/EffectsList;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 2152
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 2153
    const-class v1, Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2154
    const-string v1, "effect_mode"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2155
    iget-object v1, p0, Lcom/roidapp/photogrid/release/EffectsList;->u:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    .line 2156
    iget-object v1, p0, Lcom/roidapp/photogrid/release/EffectsList;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 2158
    :cond_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/EffectsList;->startActivity(Landroid/content/Intent;)V

    .line 2159
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/EffectsList;->finish()V

    .line 29
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/EffectsList;)Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->b:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/EffectsList;)Lcom/roidapp/photogrid/common/al;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->c:Lcom/roidapp/photogrid/common/al;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 9

    .prologue
    const v2, 0x7f0203ff

    const/4 v8, 0x2

    const/4 v7, 0x3

    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 33
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 34
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 36
    const v0, 0x7f030094

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/EffectsList;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->v:Z

    if-nez v0, :cond_0

    .line 43
    const v0, 0x7f0d0028

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/EffectsList;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 44
    new-instance v1, Lcom/roidapp/photogrid/release/bb;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/bb;-><init>(Lcom/roidapp/photogrid/release/EffectsList;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 50
    if-eqz v0, :cond_1

    array-length v0, v0

    if-ne v0, v5, :cond_1

    .line 51
    iput-boolean v6, p0, Lcom/roidapp/photogrid/release/EffectsList;->b:Z

    .line 52
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/EffectsList;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 53
    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 54
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f070209

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/EffectsList;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 60
    :goto_1
    const v0, 0x7f0d0261

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/EffectsList;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->a:Landroid/widget/ListView;

    .line 61
    new-array v0, v7, [I

    fill-array-data v0, :array_0

    .line 62
    new-array v1, v7, [Z

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/EffectsList;->b:Z

    aput-boolean v2, v1, v6

    aput-boolean v5, v1, v5

    aput-boolean v5, v1, v8

    .line 63
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/EffectsList;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x7f080000

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    .line 64
    new-array v3, v7, [Ljava/lang/String;

    aget-object v4, v2, v6

    aput-object v4, v3, v6

    aget-object v4, v2, v5

    aput-object v4, v3, v5

    aget-object v2, v2, v7

    aput-object v2, v3, v8

    .line 65
    new-instance v2, Lcom/roidapp/photogrid/release/ba;

    invoke-direct {v2, p0, v3, v0, v1}, Lcom/roidapp/photogrid/release/ba;-><init>(Landroid/content/Context;[Ljava/lang/String;[I[Z)V

    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->a:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->a:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/bc;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/bc;-><init>(Lcom/roidapp/photogrid/release/EffectsList;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 2094
    const-string v0, "DebugMode"

    invoke-virtual {p0, v0, v6}, Lcom/roidapp/photogrid/release/EffectsList;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2095
    const-string v1, "DebugMode"

    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 1100
    if-eqz v0, :cond_0

    .line 1101
    new-instance v0, Lcom/roidapp/photogrid/common/al;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/EffectsList;->d:Landroid/os/Handler;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/common/al;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->c:Lcom/roidapp/photogrid/common/al;

    .line 1102
    iget-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->c:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->b()V

    .line 1103
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ba;->b()V

    .line 86
    :cond_0
    return-void

    .line 38
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 39
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/EffectsList;->v:Z

    .line 40
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_0

    .line 56
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/EffectsList;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 57
    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto/16 :goto_1

    .line 61
    :array_0
    .array-data 4
        0x7f0203ff
        0x7f0203f7
        0x7f0203f8
    .end array-data
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->c:Lcom/roidapp/photogrid/common/al;

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->c:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->c()V

    .line 136
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 137
    iget-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 139
    :cond_1
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 140
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 144
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 145
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/EffectsList;->a()V

    .line 146
    const/4 v0, 0x1

    .line 148
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 130
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 131
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 90
    const-string v0, "effect_list"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/EffectsList;->t:Ljava/lang/String;

    .line 91
    return-void
.end method
