.class Lcom/qihoo360/mobilesafe/support/a/c$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/support/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:[B

.field public d:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 1319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1321
    iput v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    .line 1323
    iput v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$a;->b:I

    .line 1325
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$a;->c:[B

    .line 1327
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 1319
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 1330
    iget v0, p0, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    if-nez v0, :cond_0

    .line 1331
    const/4 v0, 0x1

    .line 1332
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
