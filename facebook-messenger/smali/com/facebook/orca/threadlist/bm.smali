.class public Lcom/facebook/orca/threadlist/bm;
.super Ljava/lang/Object;
.source "ThreadListLoader.java"


# instance fields
.field public final a:Lcom/facebook/orca/threads/ThreadsCollection;

.field public final b:J

.field public final c:J

.field public final d:Lcom/facebook/fbservice/c/b;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/threads/ThreadsCollection;JJLcom/facebook/fbservice/c/b;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Lcom/facebook/orca/threadlist/bm;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 87
    iput-wide p2, p0, Lcom/facebook/orca/threadlist/bm;->b:J

    .line 88
    iput-wide p4, p0, Lcom/facebook/orca/threadlist/bm;->c:J

    .line 89
    iput-object p6, p0, Lcom/facebook/orca/threadlist/bm;->d:Lcom/facebook/fbservice/c/b;

    .line 90
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/orca/threadlist/bm;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->d()Z

    move-result v0

    return v0
.end method
