.class Lcom/facebook/AsyncTask$AsyncTaskResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final mData:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TData;"
        }
    .end annotation
.end field

.field final mTask:Lcom/facebook/AsyncTask;


# direct methods
.method varargs constructor <init>(Lcom/facebook/AsyncTask;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/AsyncTask;",
            "[TData;)V"
        }
    .end annotation

    .prologue
    .line 694
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 695
    iput-object p1, p0, Lcom/facebook/AsyncTask$AsyncTaskResult;->mTask:Lcom/facebook/AsyncTask;

    .line 696
    iput-object p2, p0, Lcom/facebook/AsyncTask$AsyncTaskResult;->mData:[Ljava/lang/Object;

    .line 697
    return-void
.end method
