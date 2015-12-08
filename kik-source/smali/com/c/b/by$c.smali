.class public final Lcom/c/b/by$c;
.super Lcom/c/b/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/by;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 989
    invoke-direct {p0}, Lcom/c/b/c;-><init>()V

    return-void
.end method

.method private static a(Lcom/c/b/g;)Lcom/c/b/by;
    .locals 3

    .prologue
    .line 993
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v0

    .line 995
    :try_start_0
    invoke-virtual {v0, p0}, Lcom/c/b/by$a;->a(Lcom/c/b/g;)Lcom/c/b/by$a;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1002
    invoke-virtual {v0}, Lcom/c/b/by$a;->c()Lcom/c/b/by;

    move-result-object v0

    return-object v0

    .line 996
    :catch_0
    move-exception v1

    invoke-virtual {v0}, Lcom/c/b/by$a;->c()Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    throw v0

    .line 998
    :catch_1
    move-exception v1

    .line 999
    new-instance v2, Lcom/c/b/av;

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/c/b/by$a;->c()Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 989
    invoke-static {p1}, Lcom/c/b/by$c;->a(Lcom/c/b/g;)Lcom/c/b/by;

    move-result-object v0

    return-object v0
.end method
