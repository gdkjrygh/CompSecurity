.class public final Lcom/arist/model/equize/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/arist/activity/EqualizerActivity;

.field private b:Landroid/media/AudioManager;

.field private c:I

.field private d:Lcom/arist/model/equize/j;

.field private e:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/arist/activity/EqualizerActivity;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Lcom/arist/activity/EqualizerActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/arist/model/equize/a;->b:Landroid/media/AudioManager;

    iget-object v0, p0, Lcom/arist/model/equize/a;->b:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    iput v0, p0, Lcom/arist/model/equize/a;->c:I

    invoke-static {}, Lcom/arist/model/equize/j;->a()Lcom/arist/model/equize/j;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    invoke-virtual {p1}, Lcom/arist/activity/EqualizerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c0004

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/equize/a;->e:[Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/arist/model/equize/a;)Lcom/arist/model/equize/j;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    return-object v0
.end method

.method static synthetic a(Lcom/arist/model/equize/a;I)V
    .locals 2

    iget-object v0, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method static synthetic b(Lcom/arist/model/equize/a;)Lcom/arist/activity/EqualizerActivity;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    return-object v0
.end method


# virtual methods
.method public final a()F
    .locals 2

    iget-object v0, p0, Lcom/arist/model/equize/a;->b:Landroid/media/AudioManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/arist/model/equize/a;->c:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final a(D)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    invoke-virtual {v0, p1, p2}, Lcom/arist/model/equize/j;->a(D)V

    return-void
.end method

.method public final a(F)V
    .locals 4

    iget-object v0, p0, Lcom/arist/model/equize/a;->b:Landroid/media/AudioManager;

    const/4 v1, 0x3

    iget v2, p0, Lcom/arist/model/equize/a;->c:I

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->setStreamVolume(III)V

    return-void
.end method

.method public final a(IF)V
    .locals 3

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {p0, p2}, Lcom/arist/model/equize/a;->b(F)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/arist/model/equize/j;->a(II)V

    return-void
.end method

.method protected final a(Lcom/arist/b/a;)V
    .locals 4

    new-instance v1, Landroid/widget/EditText;

    iget-object v0, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iget-object v0, p1, Lcom/arist/b/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, Lcom/arist/b/a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/arist/b/a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0900a2

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f09004b

    new-instance v3, Lcom/arist/model/equize/e;

    invoke-direct {v3, p0, v1, p1}, Lcom/arist/model/equize/e;-><init>(Lcom/arist/model/equize/a;Landroid/widget/EditText;Lcom/arist/b/a;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f09004a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final a(Lcom/arist/b/a;Z)V
    .locals 5

    const v4, 0x7f060070

    iget-object v0, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-virtual {v0}, Lcom/arist/activity/EqualizerActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030016

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0900a1

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    const v2, 0x7f06006e

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Lcom/arist/model/equize/c;

    invoke-direct {v3, p0, v1, p1}, Lcom/arist/model/equize/c;-><init>(Lcom/arist/model/equize/a;Landroid/app/AlertDialog;Lcom/arist/b/a;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p2, :cond_0

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/arist/model/equize/d;

    invoke-direct {v2, p0, v1, p1}, Lcom/arist/model/equize/d;-><init>(Lcom/arist/model/equize/a;Landroid/app/AlertDialog;Lcom/arist/b/a;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    return-void

    :cond_0
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    const v2, 0x7f06006f

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    invoke-virtual {v0, p1}, Lcom/arist/model/equize/j;->a(Z)V

    return-void
.end method

.method public final b(F)I
    .locals 2

    invoke-virtual {p0}, Lcom/arist/model/equize/a;->f()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iget-object v1, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    invoke-virtual {v1}, Lcom/arist/model/equize/j;->d()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final b(D)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    invoke-virtual {v0, p1, p2}, Lcom/arist/model/equize/j;->b(D)V

    return-void
.end method

.method public final b(Lcom/arist/b/a;)V
    .locals 4

    new-instance v0, Landroid/widget/EditText;

    iget-object v1, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f09009f

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v2, 0x7f09004b

    new-instance v3, Lcom/arist/model/equize/f;

    invoke-direct {v3, p0, v0, p1}, Lcom/arist/model/equize/f;-><init>(Lcom/arist/model/equize/a;Landroid/widget/EditText;Lcom/arist/b/a;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const v0, 0x7f09004a

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    iget-object v0, v0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v0}, Lcom/arist/model/equize/k;->b()Z

    move-result v0

    return v0
.end method

.method public final c()Lcom/arist/b/a;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    invoke-virtual {v0}, Lcom/arist/model/equize/j;->b()Lcom/arist/b/a;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    iget-object v0, v0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/k;->a(I)V

    return-void
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/arist/model/equize/a;->e:[Ljava/lang/String;

    iget-object v1, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    iget-object v1, v1, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v1}, Lcom/arist/model/equize/k;->c()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    invoke-virtual {v0}, Lcom/arist/model/equize/j;->d()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final g()F
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    iget-object v0, v0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v0}, Lcom/arist/model/equize/k;->e()F

    move-result v0

    return v0
.end method

.method public final h()F
    .locals 1

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    iget-object v0, v0, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v0}, Lcom/arist/model/equize/k;->d()F

    move-result v0

    return v0
.end method

.method public final i()V
    .locals 5

    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v0, 0x7f0900a1

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    invoke-virtual {v0}, Lcom/arist/model/equize/j;->f()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v0, v4

    if-lt v1, v0, :cond_0

    new-instance v0, Lcom/arist/model/equize/b;

    invoke-direct {v0, p0, v3}, Lcom/arist/model/equize/b;-><init>(Lcom/arist/model/equize/a;Ljava/util/ArrayList;)V

    invoke-virtual {v2, v4, v0}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void

    :cond_0
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/a;

    iget-object v0, v0, Lcom/arist/b/a;->a:Ljava/lang/String;

    aput-object v0, v4, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final j()V
    .locals 4

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0900bf

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-virtual {v1}, Lcom/arist/activity/EqualizerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0004

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    iget-object v2, v2, Lcom/arist/model/equize/j;->e:Lcom/arist/model/equize/k;

    invoke-virtual {v2}, Lcom/arist/model/equize/k;->c()I

    move-result v2

    new-instance v3, Lcom/arist/model/equize/g;

    invoke-direct {v3, p0, v1}, Lcom/arist/model/equize/g;-><init>(Lcom/arist/model/equize/a;[Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public final k()V
    .locals 7

    const/4 v0, 0x0

    new-instance v3, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-direct {v3, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0900aa

    invoke-virtual {v3, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    invoke-virtual {v1}, Lcom/arist/model/equize/j;->g()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v5, v1, [Ljava/lang/String;

    iget-object v1, p0, Lcom/arist/model/equize/a;->d:Lcom/arist/model/equize/j;

    invoke-virtual {v1}, Lcom/arist/model/equize/j;->b()Lcom/arist/b/a;

    move-result-object v1

    iget-object v6, v1, Lcom/arist/b/a;->a:Ljava/lang/String;

    move v1, v0

    move v2, v0

    :goto_0
    array-length v0, v5

    if-lt v1, v0, :cond_0

    new-instance v0, Lcom/arist/model/equize/h;

    invoke-direct {v0, p0, v4}, Lcom/arist/model/equize/h;-><init>(Lcom/arist/model/equize/a;Ljava/util/ArrayList;)V

    invoke-virtual {v3, v5, v2, v0}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void

    :cond_0
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/a;

    iget-object v0, v0, Lcom/arist/b/a;->a:Ljava/lang/String;

    aput-object v0, v5, v1

    if-eqz v6, :cond_1

    aget-object v0, v5, v1

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v2, v1

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final l()V
    .locals 3

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/arist/model/equize/a;->a:Lcom/arist/activity/EqualizerActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0900f7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f0900ed

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f09004b

    new-instance v2, Lcom/arist/model/equize/i;

    invoke-direct {v2, p0}, Lcom/arist/model/equize/i;-><init>(Lcom/arist/model/equize/a;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method
