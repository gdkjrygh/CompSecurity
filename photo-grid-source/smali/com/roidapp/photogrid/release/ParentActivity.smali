.class public abstract Lcom/roidapp/photogrid/release/ParentActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Z

.field private c:Z

.field private d:Lcom/roidapp/cloudlib/ads/l;

.field private e:J

.field private f:J

.field private g:Z

.field private h:I

.field protected t:Ljava/lang/String;

.field protected u:Landroid/widget/LinearLayout;

.field protected v:Z

.field protected w:Z

.field public x:Lcom/roidapp/photogrid/filter/selfiecam/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 40
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 42
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->t:Ljava/lang/String;

    .line 44
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ParentActivity;->v:Z

    .line 45
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->w:Z

    .line 47
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ParentActivity;->b:Z

    return-void
.end method


# virtual methods
.method protected final A()I
    .locals 4

    .prologue
    .line 109
    iget-wide v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->f:J

    iget-wide v2, p0, Lcom/roidapp/photogrid/release/ParentActivity;->e:J

    sub-long/2addr v0, v2

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method protected B()Z
    .locals 1

    .prologue
    .line 113
    const/4 v0, 0x0

    return v0
.end method

.method protected final C()V
    .locals 3

    .prologue
    .line 156
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->c:Z

    if-eqz v0, :cond_1

    .line 174
    :cond_0
    :goto_0
    return-void

    .line 158
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->c:Z

    .line 159
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->x()V

    .line 160
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->v:Z

    if-nez v0, :cond_0

    .line 163
    const v0, 0x7f0d0086

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ParentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->u:Landroid/widget/LinearLayout;

    .line 164
    const v0, 0x7f0d0087

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ParentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->a:Landroid/widget/ImageView;

    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->a:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 168
    :cond_2
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ParentActivity;->t:Ljava/lang/String;

    invoke-virtual {v0, p0, v1}, Lcom/roidapp/cloudlib/al;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/roidapp/cloudlib/ads/l;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    .line 170
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_3

    .line 171
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ParentActivity;->u:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->o_()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p0, v1, v2}, Lcom/roidapp/cloudlib/ads/l;->a(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;)V

    goto :goto_0

    .line 173
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->D()V

    goto :goto_0
.end method

.method final D()V
    .locals 2

    .prologue
    .line 180
    const v0, 0x7f0d0085

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ParentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 181
    if-eqz v0, :cond_0

    .line 182
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 184
    :cond_0
    return-void
.end method

.method public final E()Z
    .locals 2

    .prologue
    .line 274
    iget v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->h:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final F()Z
    .locals 3

    .prologue
    .line 310
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    const/4 v0, 0x7

    iput v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->h:I

    .line 312
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "unlockedRes"

    iget v2, p0, Lcom/roidapp/photogrid/release/ParentActivity;->h:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 322
    const/4 v0, 0x1

    .line 324
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 246
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->b:Z

    return v0
.end method

.method protected o_()Ljava/lang/String;
    .locals 1

    .prologue
    .line 191
    const-string v0, "ca-app-pub-7109791911060569/9716033936"

    return-object v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 124
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->b:Z

    .line 125
    const/16 v0, 0x10

    if-eq p1, v0, :cond_0

    const/16 v0, 0x20

    if-ne p1, v0, :cond_1

    .line 126
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "PremiumDialog"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qi;

    .line 127
    if-eqz v0, :cond_2

    .line 128
    invoke-virtual {v0, p1, p2, p3}, Lcom/roidapp/photogrid/release/qi;->onActivityResult(IILandroid/content/Intent;)V

    .line 133
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 134
    return-void

    .line 130
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 56
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 57
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ParentActivity;->b:Z

    .line 58
    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/an;->b(Landroid/content/Context;I)V

    .line 1251
    invoke-static {p0}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v0

    if-ne v0, v2, :cond_1

    move v0, v1

    .line 1258
    :goto_0
    if-eqz v0, :cond_3

    .line 1259
    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/s;->a(Landroid/app/Activity;)V

    .line 61
    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "_View"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1297
    const-string v3, "page_name=%s"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1298
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 1301
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_adpage_view"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    :cond_0
    return-void

    .line 1253
    :cond_1
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v3, "ad"

    const-string v4, "adColonyEnable"

    invoke-virtual {v0, v3, v4, v2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 1254
    goto :goto_0

    .line 1255
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xa

    if-ge v0, v3, :cond_4

    move v0, v1

    .line 1256
    goto :goto_0

    .line 1260
    :cond_3
    invoke-static {}, Lcom/roidapp/cloudlib/ads/s;->a()V

    goto :goto_1

    :cond_4
    move v0, v2

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 212
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onDestroy()V

    .line 2221
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 2222
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 2224
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_1

    .line 2225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->d()V

    .line 2226
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->c()V

    .line 2227
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    .line 214
    :cond_1
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 138
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 139
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->b:Z

    .line 140
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 196
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/baselib/f/a;->b:Z

    .line 197
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 198
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->a()V

    .line 200
    :cond_0
    invoke-static {}, Lcom/roidapp/cloudlib/ads/s;->b()V

    .line 201
    return-void
.end method

.method protected onResume()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 71
    sput-boolean v2, Lcom/roidapp/baselib/f/a;->b:Z

    .line 73
    const-string v0, "notification"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ParentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 74
    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V

    .line 77
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->B()Z

    move-result v0

    if-nez v0, :cond_1

    .line 78
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->C()V

    .line 79
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    if-eqz v0, :cond_2

    .line 81
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->d:Lcom/roidapp/cloudlib/ads/l;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/l;->b()V

    .line 82
    :cond_2
    invoke-static {p0}, Lcom/roidapp/cloudlib/ads/s;->b(Landroid/app/Activity;)V

    .line 83
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ParentActivity;->b:Z

    .line 85
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->g:Z

    if-eqz v0, :cond_3

    .line 86
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ParentActivity;->setRequestedOrientation(I)V

    .line 87
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ParentActivity;->g:Z

    .line 89
    :cond_3
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 207
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->b:Z

    .line 208
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 209
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 93
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStart()V

    .line 94
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->b:Z

    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->e:J

    .line 96
    invoke-static {p0}, Lcom/roidapp/baselib/c/b;->b(Landroid/content/Context;)V

    .line 97
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->b:Z

    .line 102
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStop()V

    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/photogrid/release/ParentActivity;->f:J

    .line 104
    invoke-static {p0}, Lcom/roidapp/baselib/c/b;->c(Landroid/content/Context;)V

    .line 105
    return-void
.end method

.method public abstract x()V
.end method
