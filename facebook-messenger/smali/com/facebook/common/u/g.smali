.class Lcom/facebook/common/u/g;
.super Ljava/lang/Object;
.source "UriTemplateMap.java"


# instance fields
.field a:Z

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Lcom/facebook/common/u/h;

.field final synthetic e:Lcom/facebook/common/u/c;


# direct methods
.method constructor <init>(Lcom/facebook/common/u/c;Ljava/lang/String;Lcom/facebook/common/u/h;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 122
    iput-object p1, p0, Lcom/facebook/common/u/g;->e:Lcom/facebook/common/u/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object p2, p0, Lcom/facebook/common/u/g;->c:Ljava/lang/String;

    .line 124
    iput-object p3, p0, Lcom/facebook/common/u/g;->d:Lcom/facebook/common/u/h;

    .line 125
    iput-object p4, p0, Lcom/facebook/common/u/g;->b:Ljava/lang/String;

    .line 126
    if-nez p4, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/common/u/g;->a:Z

    .line 127
    return-void

    .line 126
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
