.class public Lkik/android/chat/fragment/KikAddToBlockFragment;
.super Lkik/android/chat/fragment/KikDefaultContactsListFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikAddToBlockFragment$a;
    }
.end annotation


# instance fields
.field protected a:Landroid/widget/AdapterView$OnItemClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;-><init>()V

    .line 39
    new-instance v0, Lkik/android/chat/fragment/be;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/be;-><init>(Lkik/android/chat/fragment/KikAddToBlockFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikAddToBlockFragment;->a:Landroid/widget/AdapterView$OnItemClickListener;

    .line 211
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikAddToBlockFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Lkik/android/chat/fragment/KikAddToBlockFragment;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 60
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikAddToBlockFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 61
    invoke-static {p2}, Lkik/android/util/cq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 62
    const v2, 0x7f090055

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p2, v3, v4

    aput-object v1, v3, v5

    invoke-virtual {p0, v2, v3}, Lkik/android/chat/fragment/KikAddToBlockFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f09003b

    new-array v3, v5, [Ljava/lang/Object;

    aput-object p2, v3, v4

    invoke-virtual {p0, v2, v3}, Lkik/android/chat/fragment/KikAddToBlockFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f090299

    new-instance v3, Lkik/android/chat/fragment/bj;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/bj;-><init>(Lkik/android/chat/fragment/KikAddToBlockFragment;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f090296

    new-instance v3, Lkik/android/chat/fragment/bf;

    invoke-direct {v3, p0, p1}, Lkik/android/chat/fragment/bf;-><init>(Lkik/android/chat/fragment/KikAddToBlockFragment;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 111
    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "addToBlock"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikAddToBlockFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 112
    return-void
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 117
    const v0, 0x7f090226

    return v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 129
    const v0, 0x7f090284

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikAddToBlockFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 147
    if-eqz p1, :cond_0

    .line 148
    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lkik/android/chat/fragment/KikAddToBlockFragment;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    :cond_0
    return-void
.end method

.method protected final a_(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 141
    invoke-direct {p0, p1, p2}, Lkik/android/chat/fragment/KikAddToBlockFragment;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    return-void
.end method

.method protected final b(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 54
    sget-object v0, Lkik/android/KikDataProvider;->e:Landroid/net/Uri;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikAddToBlockFragment;->a(Landroid/net/Uri;)V

    .line 55
    return-void
.end method

.method protected final b(Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 173
    return-void
.end method

.method protected final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 135
    const v0, 0x7f090106

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikAddToBlockFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Z
    .locals 1

    .prologue
    .line 155
    const/4 v0, 0x0

    return v0
.end method

.method protected final e()V
    .locals 0

    .prologue
    .line 162
    return-void
.end method

.method protected final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 167
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final g()Z
    .locals 1

    .prologue
    .line 184
    const/4 v0, 0x1

    return v0
.end method

.method protected final h()Ljava/lang/String;
    .locals 2

    .prologue
    .line 196
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikAddToBlockFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900e0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final i()Z
    .locals 1

    .prologue
    .line 202
    const/4 v0, 0x0

    return v0
.end method

.method protected final j()Z
    .locals 1

    .prologue
    .line 208
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 36
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->onCreate(Landroid/os/Bundle;)V

    .line 37
    return-void
.end method
