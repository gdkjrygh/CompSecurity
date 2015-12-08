.class final Lcom/roidapp/baselib/c/h;
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
.field final a:Lcom/roidapp/baselib/c/c;

.field final b:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TData;"
        }
    .end annotation
.end field


# direct methods
.method varargs constructor <init>(Lcom/roidapp/baselib/c/c;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/baselib/c/c;",
            "[TData;)V"
        }
    .end annotation

    .prologue
    .line 693
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 694
    iput-object p1, p0, Lcom/roidapp/baselib/c/h;->a:Lcom/roidapp/baselib/c/c;

    .line 695
    iput-object p2, p0, Lcom/roidapp/baselib/c/h;->b:[Ljava/lang/Object;

    .line 696
    return-void
.end method
