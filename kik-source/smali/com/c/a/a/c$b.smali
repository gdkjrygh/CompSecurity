.class final Lcom/c/a/a/c$b;
.super Lcom/c/a/a/c$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# direct methods
.method constructor <init>(Lcom/c/a/a/c;)V
    .locals 0

    .prologue
    .line 835
    invoke-direct {p0, p1}, Lcom/c/a/a/c$c;-><init>(Lcom/c/a/a/c;)V

    .line 836
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/c/a/a/c;)V
    .locals 0

    .prologue
    .line 839
    invoke-direct {p0, p1, p2}, Lcom/c/a/a/c$c;-><init>(Ljava/lang/String;Lcom/c/a/a/c;)V

    .line 840
    return-void
.end method


# virtual methods
.method final a(Ljava/lang/String;)Lcom/c/a/a/c;
    .locals 2

    .prologue
    .line 849
    new-instance v0, Lcom/c/a/a/c$b;

    iget-object v1, p0, Lcom/c/a/a/c$b;->q:Lcom/c/a/a/c;

    invoke-direct {v0, p1, v1}, Lcom/c/a/a/c$b;-><init>(Ljava/lang/String;Lcom/c/a/a/c;)V

    return-object v0
.end method
