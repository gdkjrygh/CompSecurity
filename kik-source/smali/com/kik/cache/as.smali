.class final Lcom/kik/cache/as;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cache/ad$d;


# instance fields
.field final synthetic a:Lcom/kik/cache/ProfileImageView;


# direct methods
.method constructor <init>(Lcom/kik/cache/ProfileImageView;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/kik/cache/as;->a:Lcom/kik/cache/ProfileImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/volley/w;)V
    .locals 2

    .prologue
    .line 163
    iget-object v0, p0, Lcom/kik/cache/as;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->a(Lcom/kik/cache/ProfileImageView;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 164
    return-void
.end method

.method public final a(Lcom/kik/cache/ad$c;Z)V
    .locals 2

    .prologue
    .line 155
    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/kik/cache/ad$c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/kik/cache/as;->a:Lcom/kik/cache/ProfileImageView;

    invoke-static {v0}, Lcom/kik/cache/ProfileImageView;->b(Lcom/kik/cache/ProfileImageView;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 158
    :cond_0
    return-void
.end method
