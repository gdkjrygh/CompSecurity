.class public final Lcom/b/a/c/bw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/b/a/c/bw;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    new-instance v0, Lcom/b/a/c/bw;

    invoke-direct {v0}, Lcom/b/a/c/bw;-><init>()V

    sput-object v0, Lcom/b/a/c/bw;->a:Lcom/b/a/c/bw;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, v0, v0, v0}, Lcom/b/a/c/bw;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/b/a/c/bw;->b:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lcom/b/a/c/bw;->c:Ljava/lang/String;

    .line 34
    iput-object p3, p0, Lcom/b/a/c/bw;->d:Ljava/lang/String;

    .line 35
    return-void
.end method
