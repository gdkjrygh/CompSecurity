.class Lcom/facebook/breakpad/a;
.super Ljava/lang/Object;
.source "BreakpadManager.java"

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field final synthetic a:Lcom/facebook/breakpad/BreakpadManager;


# direct methods
.method constructor <init>(Lcom/facebook/breakpad/BreakpadManager;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/facebook/breakpad/a;->a:Lcom/facebook/breakpad/BreakpadManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 130
    const-string v0, ".dmp"

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
