.class Lcom/android/core/AsyncTask$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/core/AsyncTask;
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
.field final a:Lcom/android/core/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/core/AsyncTask",
            "<***>;"
        }
    .end annotation
.end field

.field final b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TData;"
        }
    .end annotation
.end field


# direct methods
.method varargs constructor <init>(Lcom/android/core/AsyncTask;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/core/AsyncTask",
            "<***>;[TData;)V"
        }
    .end annotation

    .prologue
    .line 657
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 658
    iput-object p1, p0, Lcom/android/core/AsyncTask$a;->a:Lcom/android/core/AsyncTask;

    .line 659
    iput-object p2, p0, Lcom/android/core/AsyncTask$a;->b:[Ljava/lang/Object;

    .line 660
    return-void
.end method
