.class public abstract Lcom/b/a/b;
.super Ljava/lang/Object;
.source "DataProxy.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field job:Lcom/b/a/c;


# direct methods
.method public constructor <init>(Lcom/b/a/c;)V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/b/a/b;->job:Lcom/b/a/c;

    .line 8
    return-void
.end method


# virtual methods
.method public abstract handle(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation
.end method
