.class public Lcom/facebook/common/c/f;
.super Ljava/lang/Object;
.source "LogFile.java"


# instance fields
.field private final a:Ljava/io/File;

.field private final b:Ljava/util/Date;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/util/Date;Ljava/lang/String;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/common/c/f;->a:Ljava/io/File;

    .line 25
    iput-object p2, p0, Lcom/facebook/common/c/f;->b:Ljava/util/Date;

    .line 26
    iput-object p3, p0, Lcom/facebook/common/c/f;->c:Ljava/lang/String;

    .line 27
    return-void
.end method


# virtual methods
.method public a()Ljava/io/File;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/common/c/f;->a:Ljava/io/File;

    return-object v0
.end method

.method public b()Ljava/util/Date;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/common/c/f;->b:Ljava/util/Date;

    return-object v0
.end method
