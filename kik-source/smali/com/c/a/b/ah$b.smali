.class final Lcom/c/a/b/ah$b;
.super Lcom/c/a/b/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/b/ah;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final c:Lcom/c/a/b/p;


# direct methods
.method constructor <init>(Lcom/c/a/b/p;Lcom/c/a/b/p;)V
    .locals 0

    .prologue
    .line 117
    invoke-direct {p0, p1}, Lcom/c/a/b/p;-><init>(Lcom/c/a/b/p;)V

    .line 118
    iput-object p2, p0, Lcom/c/a/b/ah$b;->c:Lcom/c/a/b/p;

    .line 119
    return-void
.end method


# virtual methods
.method final a()Lcom/c/a/b/p;
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/c/a/b/ah$b;->c:Lcom/c/a/b/p;

    return-object v0
.end method
