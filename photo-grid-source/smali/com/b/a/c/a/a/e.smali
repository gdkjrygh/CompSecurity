.class public final Lcom/b/a/c/a/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/b/a/c/a/a/e;->a:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/b/a/c/a/a/e;->b:Ljava/lang/String;

    .line 26
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/b/a/c/a/a/e;->c:J

    .line 27
    return-void
.end method
