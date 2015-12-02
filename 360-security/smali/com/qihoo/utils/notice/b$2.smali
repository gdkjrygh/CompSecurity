.class Lcom/qihoo/utils/notice/b$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/utils/notice/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/utils/notice/b;


# direct methods
.method constructor <init>(Lcom/qihoo/utils/notice/b;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/qihoo/utils/notice/b$2;->a:Lcom/qihoo/utils/notice/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo360/mobilesafe/service/ProcessInfo;Lcom/qihoo360/mobilesafe/service/ProcessInfo;)I
    .locals 2

    .prologue
    .line 144
    iget v0, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    iget v1, p2, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    if-ge v0, v1, :cond_0

    .line 145
    const/4 v0, 0x1

    .line 150
    :goto_0
    return v0

    .line 147
    :cond_0
    iget v0, p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    iget v1, p2, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    if-le v0, v1, :cond_1

    .line 148
    const/4 v0, -0x1

    goto :goto_0

    .line 150
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 141
    check-cast p1, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    check-cast p2, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/utils/notice/b$2;->a(Lcom/qihoo360/mobilesafe/service/ProcessInfo;Lcom/qihoo360/mobilesafe/service/ProcessInfo;)I

    move-result v0

    return v0
.end method
