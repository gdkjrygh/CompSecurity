.class Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

.field final b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TData;"
        }
    .end annotation
.end field


# direct methods
.method varargs constructor <init>(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;",
            "[TData;)V"
        }
    .end annotation

    .prologue
    .line 663
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 664
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;->a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    .line 665
    iput-object p2, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$a;->b:[Ljava/lang/Object;

    .line 666
    return-void
.end method
