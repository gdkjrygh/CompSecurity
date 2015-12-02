.class public Lcom/facebook/bugreporter/b;
.super Ljava/lang/Object;
.source "BugReportBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Landroid/net/Uri;

.field private b:Ljava/lang/String;

.field private c:Landroid/net/Uri;

.field private d:Landroid/net/Uri;

.field private e:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->a:Landroid/net/Uri;

    return-object v0
.end method

.method public a(Landroid/net/Uri;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->a:Landroid/net/Uri;

    .line 78
    return-object p0
.end method

.method public a(Lcom/facebook/bugreporter/BugReport;)Lcom/facebook/bugreporter/b;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->a()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->a:Landroid/net/Uri;

    .line 43
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->b:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->c()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->c:Landroid/net/Uri;

    .line 45
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->d()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->d:Landroid/net/Uri;

    .line 46
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->e()Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->e:Lcom/google/common/a/ev;

    .line 47
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->f()Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->f:Lcom/google/common/a/ev;

    .line 48
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->g:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->h:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->i:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->j:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->k:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->l:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->m:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/b;->n:Ljava/lang/String;

    .line 56
    return-object p0
.end method

.method public a(Lcom/google/common/a/ev;)Lcom/facebook/bugreporter/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/bugreporter/b;"
        }
    .end annotation

    .prologue
    .line 161
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->e:Lcom/google/common/a/ev;

    .line 162
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->b:Ljava/lang/String;

    .line 98
    return-object p0
.end method

.method public b(Landroid/net/Uri;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->c:Landroid/net/Uri;

    .line 120
    return-object p0
.end method

.method public b(Lcom/google/common/a/ev;)Lcom/facebook/bugreporter/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/bugreporter/b;"
        }
    .end annotation

    .prologue
    .line 183
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->f:Lcom/google/common/a/ev;

    .line 184
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 203
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->g:Ljava/lang/String;

    .line 204
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public c(Landroid/net/Uri;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->d:Landroid/net/Uri;

    .line 142
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->h:Ljava/lang/String;

    .line 224
    return-object p0
.end method

.method public d()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->d:Landroid/net/Uri;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 243
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->i:Ljava/lang/String;

    .line 244
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 263
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->j:Ljava/lang/String;

    .line 264
    return-object p0
.end method

.method public e()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->e:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public f(Ljava/lang/String;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 283
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->k:Ljava/lang/String;

    .line 284
    return-object p0
.end method

.method public f()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->f:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public g(Ljava/lang/String;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 303
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->l:Ljava/lang/String;

    .line 304
    return-object p0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->g:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 325
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->m:Ljava/lang/String;

    .line 326
    return-object p0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i(Ljava/lang/String;)Lcom/facebook/bugreporter/b;
    .locals 0

    .prologue
    .line 346
    iput-object p1, p0, Lcom/facebook/bugreporter/b;->n:Ljava/lang/String;

    .line 347
    return-object p0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->i:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->j:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->k:Ljava/lang/String;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->l:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->m:Ljava/lang/String;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .prologue
    .line 337
    iget-object v0, p0, Lcom/facebook/bugreporter/b;->n:Ljava/lang/String;

    return-object v0
.end method

.method public o()Lcom/facebook/bugreporter/BugReport;
    .locals 1

    .prologue
    .line 356
    new-instance v0, Lcom/facebook/bugreporter/BugReport;

    invoke-direct {v0, p0}, Lcom/facebook/bugreporter/BugReport;-><init>(Lcom/facebook/bugreporter/b;)V

    return-object v0
.end method
