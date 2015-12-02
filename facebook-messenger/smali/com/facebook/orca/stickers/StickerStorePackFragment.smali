.class public Lcom/facebook/orca/stickers/StickerStorePackFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "StickerStorePackFragment.java"

# interfaces
.implements Lcom/facebook/base/fragment/b;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private Z:Landroid/widget/TextView;

.field private aa:Landroid/widget/TextView;

.field private ab:Landroid/widget/TextView;

.field private ac:Landroid/widget/Button;

.field private ad:Landroid/widget/ProgressBar;

.field private ae:Lcom/facebook/widget/images/UrlImage;

.field private b:Lcom/facebook/base/fragment/c;

.field private c:Lcom/facebook/config/a/a;

.field private d:Lcom/facebook/fbservice/ops/k;

.field private e:Lcom/facebook/orca/stickers/c;

.field private f:Lcom/facebook/orca/stickers/h;

.field private g:Lcom/facebook/orca/stickers/StickerPack;

.field private h:Z

.field private i:Lcom/facebook/widget/images/UrlImage;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/orca/stickers/StickerStorePackFragment;

    sput-object v0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerStorePackFragment;)Lcom/facebook/orca/stickers/StickerPack;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->g:Lcom/facebook/orca/stickers/StickerPack;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private a(Lcom/facebook/orca/stickers/StickerPack;)V
    .locals 3

    .prologue
    .line 139
    const-string v0, "sticker_pack_download_tapped"

    invoke-virtual {p0, v0, p1}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->a(Ljava/lang/String;Lcom/facebook/orca/stickers/StickerPack;)V

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ac:Landroid/widget/Button;

    sget v1, Lcom/facebook/o;->sticker_store_downloading:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 141
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ac:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 143
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 144
    const-string v1, "stickerPack"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 145
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->d:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->J:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 147
    new-instance v1, Lcom/facebook/orca/stickers/aj;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/stickers/aj;-><init>(Lcom/facebook/orca/stickers/StickerStorePackFragment;Lcom/facebook/orca/stickers/StickerPack;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 168
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/stickers/StickerStorePackFragment;Lcom/facebook/orca/stickers/StickerPack;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->a(Lcom/facebook/orca/stickers/StickerPack;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/stickers/StickerStorePackFragment;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ad:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private b()V
    .locals 2

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->g:Lcom/facebook/orca/stickers/StickerPack;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->i:Lcom/facebook/widget/images/UrlImage;

    if-nez v0, :cond_1

    .line 136
    :cond_0
    :goto_0
    return-void

    .line 116
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->i:Lcom/facebook/widget/images/UrlImage;

    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->g:Lcom/facebook/orca/stickers/StickerPack;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/StickerPack;->d()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->Z:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->g:Lcom/facebook/orca/stickers/StickerPack;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/StickerPack;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->aa:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->sticker_store_price_free:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ab:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->g:Lcom/facebook/orca/stickers/StickerPack;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/StickerPack;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    iget-boolean v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->h:Z

    if-eqz v0, :cond_2

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ac:Landroid/widget/Button;

    sget v1, Lcom/facebook/o;->sticker_store_downloaded:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 127
    :goto_1
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ac:Landroid/widget/Button;

    iget-boolean v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->h:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :goto_2
    invoke-virtual {v1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 129
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ae:Lcom/facebook/widget/images/UrlImage;

    new-instance v1, Lcom/facebook/orca/stickers/ai;

    invoke-direct {v1, p0}, Lcom/facebook/orca/stickers/ai;-><init>(Lcom/facebook/orca/stickers/StickerStorePackFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setOnImageDownloadListener(Lcom/facebook/widget/images/k;)V

    .line 135
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ae:Lcom/facebook/widget/images/UrlImage;

    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->g:Lcom/facebook/orca/stickers/StickerPack;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/StickerPack;->e()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    goto :goto_0

    .line 125
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ac:Landroid/widget/Button;

    sget v1, Lcom/facebook/o;->sticker_store_download:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    goto :goto_1

    .line 127
    :cond_3
    const/4 v0, 0x0

    goto :goto_2
.end method

.method static synthetic c(Lcom/facebook/orca/stickers/StickerStorePackFragment;)Landroid/widget/Button;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ac:Landroid/widget/Button;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 69
    sget v0, Lcom/facebook/k;->orca_sticker_store_pack_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/base/fragment/c;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->b:Lcom/facebook/base/fragment/c;

    .line 102
    return-void
.end method

.method public a(Lcom/facebook/orca/stickers/StickerPack;Z)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->g:Lcom/facebook/orca/stickers/StickerPack;

    .line 106
    iput-boolean p2, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->h:Z

    .line 108
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->b()V

    .line 109
    return-void
.end method

.method protected a(Ljava/lang/String;Lcom/facebook/orca/stickers/StickerPack;)V
    .locals 3

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->f:Lcom/facebook/orca/stickers/h;

    const-string v1, "sticker_store_pack"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/stickers/h;->a(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 172
    const-string v1, "action"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 173
    const-string v1, "sticker_pack"

    invoke-virtual {p2}, Lcom/facebook/orca/stickers/StickerPack;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 174
    const-string v1, "is_featured"

    invoke-virtual {p2}, Lcom/facebook/orca/stickers/StickerPack;->h()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 175
    iget-object v1, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->f:Lcom/facebook/orca/stickers/h;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/stickers/h;->a(Lcom/facebook/analytics/cb;)V

    .line 176
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 74
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 76
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 77
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->c:Lcom/facebook/config/a/a;

    .line 78
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->d:Lcom/facebook/fbservice/ops/k;

    .line 79
    const-class v0, Lcom/facebook/orca/stickers/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/c;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->e:Lcom/facebook/orca/stickers/c;

    .line 80
    const-class v0, Lcom/facebook/orca/stickers/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/h;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->f:Lcom/facebook/orca/stickers/h;

    .line 82
    sget v0, Lcom/facebook/i;->thumbnail:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->i:Lcom/facebook/widget/images/UrlImage;

    .line 83
    sget v0, Lcom/facebook/i;->name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->Z:Landroid/widget/TextView;

    .line 84
    sget v0, Lcom/facebook/i;->price:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->aa:Landroid/widget/TextView;

    .line 85
    sget v0, Lcom/facebook/i;->description:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ab:Landroid/widget/TextView;

    .line 86
    sget v0, Lcom/facebook/i;->download_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ac:Landroid/widget/Button;

    .line 87
    sget v0, Lcom/facebook/i;->loading_indicator:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ad:Landroid/widget/ProgressBar;

    .line 88
    sget v0, Lcom/facebook/i;->preview:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    iput-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ae:Lcom/facebook/widget/images/UrlImage;

    .line 90
    iget-object v0, p0, Lcom/facebook/orca/stickers/StickerStorePackFragment;->ac:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/stickers/ah;

    invoke-direct {v1, p0}, Lcom/facebook/orca/stickers/ah;-><init>(Lcom/facebook/orca/stickers/StickerStorePackFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    invoke-direct {p0}, Lcom/facebook/orca/stickers/StickerStorePackFragment;->b()V

    .line 98
    return-void
.end method
