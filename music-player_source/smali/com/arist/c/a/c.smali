.class final Lcom/arist/c/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/b/f/a;


# instance fields
.field private final synthetic a:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/c/a/c;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/arist/c/a/c;->a:Landroid/widget/ImageView;

    instance-of v0, v0, Lcom/arist/model/skin/ColorImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/c/a/c;->a:Landroid/widget/ImageView;

    check-cast v0, Lcom/arist/model/skin/ColorImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorImageView;->a(Z)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/arist/c/a/c;->a:Landroid/widget/ImageView;

    instance-of v0, v0, Lcom/arist/model/skin/ColorImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/c/a/c;->a:Landroid/widget/ImageView;

    check-cast v0, Lcom/arist/model/skin/ColorImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorImageView;->a(Z)V

    :cond_0
    return-void
.end method
