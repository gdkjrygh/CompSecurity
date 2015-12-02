.class public Lcom/qihoo/security/ui/antivirus/list/FolderImageView;
.super Landroid/widget/FrameLayout;
.source "360Security"


# instance fields
.field private a:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

.field private b:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

.field private c:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

.field private d:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/widget/ImageView/RemoteImageView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->e:Ljava/util/List;

    .line 34
    const v0, 0x7f0300a9

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 35
    return-void
.end method


# virtual methods
.method protected onFinishInflate()V
    .locals 2

    .prologue
    .line 39
    invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V

    .line 40
    const v0, 0x7f0b0223

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->a:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 41
    const v0, 0x7f0b0224

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->b:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 42
    const v0, 0x7f0b0225

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->c:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 43
    const v0, 0x7f0b0226

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->d:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 45
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 46
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->a:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->b:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->c:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->d:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    return-void
.end method

.method public setFolderImageView(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const v7, 0x7f020042

    .line 53
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    .line 54
    if-nez p1, :cond_0

    move v2, v0

    :goto_0
    move v3, v0

    .line 56
    :goto_1
    if-ge v3, v4, :cond_3

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->e:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 58
    if-ge v3, v2, :cond_2

    .line 59
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 60
    invoke-virtual {p0}, Lcom/qihoo/security/ui/antivirus/list/FolderImageView;->getContext()Landroid/content/Context;

    move-result-object v5

    iget-object v6, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-static {v5, v6}, Lcom/qihoo360/mobilesafe/b/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 61
    iget-object v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1, v7}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->b(Ljava/lang/String;I)V

    .line 56
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 54
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    move v2, v1

    goto :goto_0

    .line 63
    :cond_1
    iget-object v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1, v7}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->c(Ljava/lang/String;I)V

    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {v0, v7}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageResource(I)V

    goto :goto_2

    .line 69
    :cond_3
    return-void
.end method
