.class Lcom/qihoo360/mobilesafe/b/g$a;
.super Ljava/lang/ref/SoftReference;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/b/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/SoftReference",
        "<",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo360/mobilesafe/b/g;


# direct methods
.method public constructor <init>(Lcom/qihoo360/mobilesafe/b/g;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 46
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/b/g$a;->b:Lcom/qihoo360/mobilesafe/b/g;

    .line 47
    invoke-direct {p0, p3}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/g$a;->a:Ljava/lang/String;

    .line 48
    iput-object p2, p0, Lcom/qihoo360/mobilesafe/b/g$a;->a:Ljava/lang/String;

    .line 49
    return-void
.end method
