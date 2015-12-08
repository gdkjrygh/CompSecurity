.class public Lkik/android/chat/fragment/KikPreferenceLaunchpad;
.super Lkik/android/chat/fragment/settings/KikPreferenceFragment;
.source "SourceFile"

# interfaces
.implements Lkik/android/e/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;,
        Lkik/android/chat/fragment/KikPreferenceLaunchpad$b;
    }
.end annotation


# static fields
.field private static final l:Lorg/c/b;


# instance fields
.field a:Lkik/android/chat/fragment/ProgressDialogFragment;

.field protected b:Lkik/a/f/k;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/n;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field e:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field private final k:Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

.field private m:Lkik/android/widget/preferences/KikProfilePicPreference;

.field private volatile n:Z

.field private o:Lcom/kik/g/f;

.field private p:Lcom/kik/g/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 74
    const-string v0, "KikPreferenceLaunchpad"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->l:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0}, Lkik/android/chat/fragment/settings/KikPreferenceFragment;-><init>()V

    .line 51
    new-instance v0, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->k:Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->n:Z

    .line 82
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->o:Lcom/kik/g/f;

    .line 83
    new-instance v0, Lkik/android/chat/fragment/nr;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/nr;-><init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->p:Lcom/kik/g/i;

    .line 380
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->d()V

    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->f()V

    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 188
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 189
    invoke-static {}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$b;->a()V

    .line 190
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Lkik/android/util/p;->a(Lkik/android/chat/fragment/KikScopedDialogFragment;Landroid/content/Context;)V

    .line 191
    return-void
.end method

.method private f()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x1

    .line 275
    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v1, Lcom/kik/d/b/a$k;->M:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "s"

    aput-object v5, v4, v9

    sget-object v5, Lcom/kik/d/b/a$c;->a:Lcom/kik/d/b/a$c;

    invoke-virtual {v5}, Lcom/kik/d/b/a$c;->a()I

    move-result v5

    int-to-long v6, v5

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;J[Ljava/lang/Object;)V

    .line 278
    new-instance v0, Lkik/android/util/p$a;

    iget-object v1, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->b:Lkik/a/f/k;

    iget-object v2, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->c:Lkik/a/e/n;

    iget-object v3, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->g:Lkik/a/e/w;

    iget-object v4, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->d:Lkik/a/e/v;

    invoke-direct {v0, v1, v2, v3, v4}, Lkik/android/util/p$a;-><init>(Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/w;Lkik/a/e/v;)V

    .line 279
    new-array v1, v8, [Lkik/android/e/d;

    aput-object p0, v1, v9

    invoke-virtual {v0, v1}, Lkik/android/util/p$a;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 281
    iget-object v1, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 282
    iget-object v1, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismiss()V

    .line 285
    :cond_0
    new-instance v1, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v2, 0x7f090207

    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v8}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    iput-object v1, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    .line 286
    iget-object v1, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    new-instance v2, Lkik/android/chat/fragment/nx;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/nx;-><init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;Lkik/android/util/p$a;)V

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 293
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 294
    return-void
.end method


# virtual methods
.method protected final a(I)I
    .locals 1

    .prologue
    .line 107
    const v0, 0x7f07007b

    return v0
.end method

.method protected final a()V
    .locals 1

    .prologue
    .line 169
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->c()Landroid/widget/ListView;

    move-result-object v0

    .line 171
    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {v0}, Landroid/widget/ListView;->postInvalidate()V

    .line 175
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->m:Lkik/android/widget/preferences/KikProfilePicPreference;

    if-eqz v0, :cond_1

    .line 176
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->m:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikProfilePicPreference;->d()V

    .line 178
    :cond_1
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 3

    .prologue
    .line 326
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v0, :cond_0

    .line 327
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 330
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->g:Lkik/a/e/w;

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x5a

    invoke-static {p1, v1, v2}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/w;->a([B)V

    .line 331
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->g:Lkik/a/e/w;

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-static {p1, v1, v2}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/w;->b([B)V

    .line 332
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 333
    if-eqz v0, :cond_1

    .line 334
    new-instance v1, Lkik/android/chat/fragment/ny;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ny;-><init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 344
    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0901d5

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 345
    return-void
.end method

.method public final k_()V
    .locals 3

    .prologue
    .line 356
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->n:Z

    if-eqz v0, :cond_0

    .line 357
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismiss()V

    .line 359
    :cond_0
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 362
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    invoke-static {}, Lkik/android/util/cq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f0901d0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090300

    new-instance v2, Lkik/android/chat/fragment/oa;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/oa;-><init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090299

    new-instance v2, Lkik/android/chat/fragment/nz;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/nz;-><init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 376
    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "build"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 378
    :cond_1
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    .prologue
    const/4 v1, -0x1

    .line 209
    invoke-static {}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$b;->b()V

    .line 210
    const/16 v0, 0x285e

    if-eq p1, v0, :cond_0

    const/16 v0, 0x285f

    if-ne p1, v0, :cond_2

    :cond_0
    if-ne p2, v1, :cond_2

    .line 212
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v5, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->c:Lkik/a/e/n;

    move-object v1, p0

    move v3, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lkik/android/util/p;->a(Landroid/support/v4/app/Fragment;Landroid/content/Context;ILandroid/content/Intent;Lkik/a/e/n;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 213
    const v0, 0x7f0902ba

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0900ae

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090193

    new-instance v2, Lkik/android/chat/fragment/nu;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/nu;-><init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 228
    :cond_1
    :goto_0
    return-void

    .line 216
    :cond_2
    const/16 v0, 0x2860

    if-ne p1, v0, :cond_3

    if-ne p2, v1, :cond_3

    .line 218
    :try_start_0
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->g()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/util/p;->g()V

    throw v0

    .line 226
    :cond_3
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/p;->g()V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 113
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V

    .line 114
    invoke-super {p0, p1}, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->onCreate(Landroid/os/Bundle;)V

    .line 115
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->k:Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;->a(Landroid/os/Bundle;)V

    .line 116
    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v1, Lcom/kik/d/b/a$k;->w:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;J)V

    .line 117
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 122
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    .line 124
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->c()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setVerticalFadingEdgeEnabled(Z)V

    .line 126
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x9

    if-lt v0, v2, :cond_0

    .line 127
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->c()Landroid/widget/ListView;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOverScrollMode(I)V

    .line 130
    :cond_0
    const-string v0, "kik.profile.picture"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lkik/android/widget/preferences/KikProfilePicPreference;

    iput-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->m:Lkik/android/widget/preferences/KikProfilePicPreference;

    .line 132
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->m:Lkik/android/widget/preferences/KikProfilePicPreference;

    if-eqz v0, :cond_1

    .line 133
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->V()Lcom/kik/e/a;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->m:Lkik/android/widget/preferences/KikProfilePicPreference;

    invoke-interface {v0, v2}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/KikProfilePicPreference;)V

    .line 134
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->m:Lkik/android/widget/preferences/KikProfilePicPreference;

    iget-object v2, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->e:Lcom/kik/cache/ad;

    invoke-virtual {v0, v2}, Lkik/android/widget/preferences/KikProfilePicPreference;->a(Lcom/kik/cache/ad;)V

    .line 135
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->m:Lkik/android/widget/preferences/KikProfilePicPreference;

    new-instance v2, Lkik/android/chat/fragment/nt;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/nt;-><init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V

    invoke-virtual {v0, v2}, Lkik/android/widget/preferences/KikProfilePicPreference;->a(Lkik/android/widget/preferences/KikProfilePicPreference$a;)V

    .line 142
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->k:Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 143
    invoke-direct {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->d()V

    .line 150
    :cond_1
    :goto_0
    const v0, 0x102000a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 151
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 153
    invoke-static {v6}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    invoke-virtual {v2, v6, v3, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 155
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 157
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->g:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->f()V

    .line 160
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->o:Lcom/kik/g/f;

    iget-object v2, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->S:Lkik/a/e/f;

    invoke-interface {v2}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->p:Lcom/kik/g/i;

    invoke-virtual {v0, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 162
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v2, "kik.android.KikPreferenceActivity.extra.pic.byte"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v3, Lkik/android/chat/fragment/nv;

    invoke-direct {v3, p0, v2}, Lkik/android/chat/fragment/nv;-><init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;[B)V

    iget-object v2, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-nez v2, :cond_2

    new-instance v2, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v4, 0x7f090207

    invoke-virtual {p0, v4}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v2, v4, v5}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    iput-object v2, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    iget-object v2, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    new-instance v4, Lkik/android/chat/fragment/nw;

    invoke-direct {v4, p0, v3}, Lkik/android/chat/fragment/nw;-><init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;Lkik/android/util/bf;)V

    invoke-virtual {v2, v4}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v2, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    :cond_2
    new-array v2, v6, [Ljava/lang/Void;

    invoke-virtual {v3, v2}, Lkik/android/util/bf;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_3
    const-string v2, "kik.android.KikPreferenceActivity.extra.pic.byte"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 163
    :cond_4
    return-object v1

    .line 145
    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->k:Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->g:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->h:Lcom/kik/android/a;

    iget-object v4, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->e:Lcom/kik/cache/ad;

    invoke-static {v0, v2, v3, v4}, Lkik/android/util/cc;->a(Lkik/a/d/aa;Landroid/content/Context;Lcom/kik/android/a;Lcom/kik/cache/ad;)V

    goto/16 :goto_0
.end method

.method public onDestroyView()V
    .locals 1

    .prologue
    .line 319
    invoke-super {p0}, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->onDestroyView()V

    .line 320
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->o:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 321
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 299
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->n:Z

    .line 300
    invoke-super {p0}, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->onPause()V

    .line 301
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 306
    invoke-super {p0}, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->onResume()V

    .line 307
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->n:Z

    .line 308
    iget-object v0, p0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->g:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->l()V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a()V

    .line 309
    return-void
.end method
