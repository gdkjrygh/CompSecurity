.class Lcom/qihoo/security/ui/b/a$e;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field a:[I

.field final synthetic b:Lcom/qihoo/security/ui/b/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/b/a;[I)V
    .locals 0

    .prologue
    .line 159
    iput-object p1, p0, Lcom/qihoo/security/ui/b/a$e;->b:Lcom/qihoo/security/ui/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 160
    iput-object p2, p0, Lcom/qihoo/security/ui/b/a$e;->a:[I

    .line 161
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 171
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a$e;->b:Lcom/qihoo/security/ui/b/a;

    invoke-static {v0}, Lcom/qihoo/security/ui/b/a;->a(Lcom/qihoo/security/ui/b/a;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 172
    iget-object v2, p0, Lcom/qihoo/security/ui/b/a$e;->a:[I

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget v4, v2, v0

    .line 173
    iget-object v5, p0, Lcom/qihoo/security/ui/b/a$e;->b:Lcom/qihoo/security/ui/b/a;

    invoke-static {v5}, Lcom/qihoo/security/ui/b/a;->b(Lcom/qihoo/security/ui/b/a;)Lcom/qihoo/security/ui/b/a$b;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, Lcom/qihoo/security/ui/b/a$b;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 178
    :catch_0
    move-exception v0

    .line 183
    :cond_0
    return-void
.end method
