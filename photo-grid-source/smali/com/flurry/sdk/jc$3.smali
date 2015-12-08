.class Lcom/flurry/sdk/jc$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field final synthetic a:Lcom/flurry/sdk/jc;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/jc;)V
    .locals 0

    .prologue
    .line 384
    iput-object p1, p0, Lcom/flurry/sdk/jc$3;->a:Lcom/flurry/sdk/jc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 387
    const-string v0, ".flurryagent."

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
