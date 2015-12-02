.class public Lcom/facebook/orca/stickers/StickerStoreActivity;
.super Lcom/facebook/base/activity/i;
.source "StickerStoreActivity.java"


# static fields
.field private static final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private q:Lcom/facebook/widget/titlebar/a;

.field private r:Lcom/facebook/orca/stickers/StickerStoreFragment;

.field private s:Lcom/facebook/orca/stickers/StickerStorePackFragment;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/orca/stickers/StickerStoreActivity;

    sput-object v0, Lcom/facebook/orca/stickers/StickerStoreActivity;->p:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method private a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 159
    if-nez p2, :cond_1

    .line 160
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->finish()V

    .line 171
    :cond_0
    :goto_0
    return-void

    .line 164
    :cond_1
    instance-of v0, p1, Lcom/facebook/orca/stickers/StickerStoreFragment;

    if-eqz v0, :cond_0

    .line 165
    const-string v0, "stickerPack"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 167
    const-string v1, "isOwned"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    .line 169
    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/stickers/StickerStoreActivity;->a(Lcom/facebook/orca/stickers/StickerPack;ZZ)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/stickers/StickerPack;ZZ)V
    .locals 3

    .prologue
    .line 116
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->f()Landroid/support/v4/app/q;

    move-result-object v0

    .line 117
    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 118
    sget-object v0, Lcom/facebook/orca/stickers/StickerStoreActivity;->p:Ljava/lang/Class;

    const-string v1, "Unable to safely commit fragment transactions--aborting operation."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 134
    :cond_0
    :goto_0
    return-void

    .line 122
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 125
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->s:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    invoke-virtual {v1, p1, p2}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->a(Lcom/facebook/orca/stickers/StickerPack;Z)V

    .line 127
    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 128
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->f()Landroid/support/v4/app/q;

    move-result-object v1

    const-string v2, "storeFragment"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 129
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->s:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->c(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 130
    if-eqz p3, :cond_2

    .line 131
    const-string v1, "packFragment"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->a(Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 133
    :cond_2
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerStoreActivity;Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/stickers/StickerStoreActivity;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    return-void
.end method

.method private j()V
    .locals 2

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->f()Landroid/support/v4/app/q;

    move-result-object v0

    .line 77
    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 78
    sget-object v0, Lcom/facebook/orca/stickers/StickerStoreActivity;->p:Ljava/lang/Class;

    const-string v1, "Unable to safely commit fragment transactions--aborting operation."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 89
    :cond_0
    :goto_0
    return-void

    .line 82
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 86
    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 87
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->r:Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->c(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 88
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    goto :goto_0
.end method

.method private k()Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 92
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->f()Landroid/support/v4/app/q;

    move-result-object v2

    .line 93
    const-string v0, "storeFragment"

    invoke-virtual {v2, v0}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerStoreFragment;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->r:Lcom/facebook/orca/stickers/StickerStoreFragment;

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->r:Lcom/facebook/orca/stickers/StickerStoreFragment;

    if-eqz v0, :cond_0

    move v0, v1

    .line 109
    :goto_0
    return v0

    .line 99
    :cond_0
    invoke-virtual {v2}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 100
    sget-object v0, Lcom/facebook/orca/stickers/StickerStoreActivity;->p:Ljava/lang/Class;

    const-string v1, "Unable to safely commit fragment transactions--aborting operation."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 101
    const/4 v0, 0x0

    goto :goto_0

    .line 103
    :cond_1
    new-instance v0, Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-direct {v0}, Lcom/facebook/orca/stickers/StickerStoreFragment;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->r:Lcom/facebook/orca/stickers/StickerStoreFragment;

    .line 104
    invoke-virtual {v2}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 105
    sget v3, Lcom/facebook/i;->container:I

    iget-object v4, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->r:Lcom/facebook/orca/stickers/StickerStoreFragment;

    const-string v5, "storeFragment"

    invoke-virtual {v0, v3, v4, v5}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 106
    iget-object v3, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->r:Lcom/facebook/orca/stickers/StickerStoreFragment;

    invoke-virtual {v0, v3}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 107
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 108
    invoke-virtual {v2}, Landroid/support/v4/app/q;->b()Z

    move v0, v1

    .line 109
    goto :goto_0
.end method

.method private l()Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 137
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->f()Landroid/support/v4/app/q;

    move-result-object v2

    .line 138
    const-string v0, "packFragment"

    invoke-virtual {v2, v0}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerStorePackFragment;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->s:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->s:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    if-eqz v0, :cond_0

    move v0, v1

    .line 155
    :goto_0
    return v0

    .line 145
    :cond_0
    invoke-virtual {v2}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 146
    sget-object v0, Lcom/facebook/orca/stickers/StickerStoreActivity;->p:Ljava/lang/Class;

    const-string v1, "Unable to safely commit fragment transactions--aborting operation."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 147
    const/4 v0, 0x0

    goto :goto_0

    .line 149
    :cond_1
    new-instance v0, Lcom/facebook/orca/stickers/StickerStorePackFragment;

    invoke-direct {v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->s:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    .line 150
    invoke-virtual {v2}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 151
    sget v3, Lcom/facebook/i;->container:I

    iget-object v4, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->s:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    const-string v5, "packFragment"

    invoke-virtual {v0, v3, v4, v5}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 152
    iget-object v3, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->s:Lcom/facebook/orca/stickers/StickerStorePackFragment;

    invoke-virtual {v0, v3}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 153
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 154
    invoke-virtual {v2}, Landroid/support/v4/app/q;->b()Z

    move v0, v1

    .line 155
    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 61
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->a(Landroid/support/v4/app/Fragment;)V

    .line 63
    instance-of v0, p1, Lcom/facebook/base/fragment/b;

    if-nez v0, :cond_0

    .line 73
    :goto_0
    return-void

    .line 67
    :cond_0
    check-cast p1, Lcom/facebook/base/fragment/b;

    new-instance v0, Lcom/facebook/orca/stickers/x;

    invoke-direct {v0, p0}, Lcom/facebook/orca/stickers/x;-><init>(Lcom/facebook/orca/stickers/StickerStoreActivity;)V

    invoke-interface {p1, v0}, Lcom/facebook/base/fragment/b;->a(Lcom/facebook/base/fragment/c;)V

    goto :goto_0
.end method

.method protected b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 38
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 40
    sget v0, Lcom/facebook/k;->orca_sticker_store:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->setContentView(I)V

    .line 42
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 43
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->q:Lcom/facebook/widget/titlebar/a;

    .line 44
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStoreActivity;->q:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->sticker_store_title:I

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(I)V

    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    const-string v0, "stickerPack"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 52
    :cond_0
    if-nez v0, :cond_1

    .line 53
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStoreActivity;->j()V

    .line 57
    :goto_0
    return-void

    .line 55
    :cond_1
    invoke-direct {p0, v0, v2, v2}, Lcom/facebook/orca/stickers/StickerStoreActivity;->a(Lcom/facebook/orca/stickers/StickerPack;ZZ)V

    goto :goto_0
.end method
