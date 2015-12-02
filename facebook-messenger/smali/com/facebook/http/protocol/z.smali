.class public Lcom/facebook/http/protocol/z;
.super Ljava/lang/Object;
.source "BatchOperation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PARAMS:",
        "Ljava/lang/Object;",
        "RESU",
        "LT:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/http/protocol/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/http/protocol/f",
            "<TPARAMS;TRESU",
            "LT;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TPARAMS;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/http/protocol/f",
            "<TPARAMS;TRESU",
            "LT;",
            ">;TPARAMS;)V"
        }
    .end annotation

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/facebook/http/protocol/z;->a:Lcom/facebook/http/protocol/f;

    .line 62
    iput-object p2, p0, Lcom/facebook/http/protocol/z;->b:Ljava/lang/Object;

    .line 63
    return-void
.end method

.method static synthetic a(Lcom/facebook/http/protocol/z;)Lcom/facebook/http/protocol/f;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/http/protocol/z;->a:Lcom/facebook/http/protocol/f;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/http/protocol/z;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/http/protocol/z;->b:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/http/protocol/z;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/http/protocol/z;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/http/protocol/z;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/http/protocol/z;->d:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/http/protocol/y",
            "<TPARAMS;TRESU",
            "LT;",
            ">;"
        }
    .end annotation

    .prologue
    .line 92
    new-instance v0, Lcom/facebook/http/protocol/y;

    invoke-direct {v0, p0}, Lcom/facebook/http/protocol/y;-><init>(Lcom/facebook/http/protocol/z;)V

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/http/protocol/z",
            "<TPARAMS;TRESU",
            "LT;",
            ">;"
        }
    .end annotation

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/http/protocol/z;->c:Ljava/lang/String;

    .line 79
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/http/protocol/z",
            "<TPARAMS;TRESU",
            "LT;",
            ">;"
        }
    .end annotation

    .prologue
    .line 87
    iput-object p1, p0, Lcom/facebook/http/protocol/z;->d:Ljava/lang/String;

    .line 88
    return-object p0
.end method
