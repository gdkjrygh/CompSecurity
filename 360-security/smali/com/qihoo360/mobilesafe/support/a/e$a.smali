.class Lcom/qihoo360/mobilesafe/support/a/e$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/support/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:J

.field b:Lcom/qihoo360/mobilesafe/support/a/c;

.field c:Z

.field d:Z

.field e:I

.field final synthetic f:Lcom/qihoo360/mobilesafe/support/a/e;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/e;)V
    .locals 1

    .prologue
    .line 737
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/e$a;->f:Lcom/qihoo360/mobilesafe/support/a/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 749
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/e$a;->d:Z

    .line 750
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo360/mobilesafe/support/a/e$a;->e:I

    return-void
.end method
