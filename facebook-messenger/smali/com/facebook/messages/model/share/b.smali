.class public Lcom/facebook/messages/model/share/b;
.super Ljava/lang/Object;
.source "ShareBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/ShareMedia;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/ShareProperty;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/b;->f:Ljava/util/List;

    .line 21
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/share/b;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/messages/model/share/b;->a:Ljava/lang/String;

    .line 29
    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/facebook/messages/model/share/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/ShareMedia;",
            ">;)",
            "Lcom/facebook/messages/model/share/b;"
        }
    .end annotation

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/messages/model/share/b;->f:Ljava/util/List;

    .line 56
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/messages/model/share/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/facebook/messages/model/share/b;->b:Ljava/lang/String;

    .line 38
    return-object p0
.end method

.method public b(Ljava/util/List;)Lcom/facebook/messages/model/share/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/ShareProperty;",
            ">;)",
            "Lcom/facebook/messages/model/share/b;"
        }
    .end annotation

    .prologue
    .line 82
    iput-object p1, p0, Lcom/facebook/messages/model/share/b;->g:Ljava/util/List;

    .line 83
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/messages/model/share/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/messages/model/share/b;->c:Ljava/lang/String;

    .line 47
    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/messages/model/share/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/messages/model/share/b;->d:Ljava/lang/String;

    .line 65
    return-object p0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/ShareMedia;",
            ">;"
        }
    .end annotation

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/messages/model/share/b;->f:Ljava/util/List;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/messages/model/share/b;
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/facebook/messages/model/share/b;->e:Ljava/lang/String;

    .line 74
    return-object p0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/messages/model/share/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/messages/model/share/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/ShareProperty;",
            ">;"
        }
    .end annotation

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/messages/model/share/b;->g:Ljava/util/List;

    return-object v0
.end method

.method public h()Lcom/facebook/messages/model/share/Share;
    .locals 1

    .prologue
    .line 87
    new-instance v0, Lcom/facebook/messages/model/share/Share;

    invoke-direct {v0, p0}, Lcom/facebook/messages/model/share/Share;-><init>(Lcom/facebook/messages/model/share/b;)V

    return-object v0
.end method
