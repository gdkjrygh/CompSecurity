.class Lcom/facebook/orca/images/j;
.super Lcom/facebook/orca/photos/picking/i;
.source "ThreadIconPickerActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/images/ThreadIconPickerActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/images/ThreadIconPickerActivity;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/facebook/orca/images/j;->a:Lcom/facebook/orca/images/ThreadIconPickerActivity;

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/orca/images/j;->a:Lcom/facebook/orca/images/ThreadIconPickerActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->finish()V

    .line 82
    return-void
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 2

    .prologue
    .line 74
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 76
    iget-object v1, p0, Lcom/facebook/orca/images/j;->a:Lcom/facebook/orca/images/ThreadIconPickerActivity;

    invoke-static {v1, v0}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->a(Lcom/facebook/orca/images/ThreadIconPickerActivity;Ljava/io/File;)V

    .line 77
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/orca/images/j;->a:Lcom/facebook/orca/images/ThreadIconPickerActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->finish()V

    .line 87
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/images/j;->a:Lcom/facebook/orca/images/ThreadIconPickerActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->a(Lcom/facebook/orca/images/ThreadIconPickerActivity;Ljava/io/File;)V

    .line 92
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/orca/images/j;->a:Lcom/facebook/orca/images/ThreadIconPickerActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->finish()V

    .line 97
    return-void
.end method
