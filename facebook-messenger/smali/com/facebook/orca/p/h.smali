.class public Lcom/facebook/orca/p/h;
.super Ljava/lang/Object;
.source "ShortNameHelper.java"


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Locale;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Locale;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/orca/p/h;->a:Ljavax/inject/a;

    .line 24
    return-void
.end method


# virtual methods
.method public a(Landroid/content/res/Resources;Lcom/facebook/user/User;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/orca/p/h;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Locale;

    .line 28
    sget-object v1, Lcom/facebook/user/a/g;->b:Lcom/google/common/a/fi;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {p2}, Lcom/facebook/user/User;->f()Ljava/lang/String;

    move-result-object v0

    .line 38
    :goto_0
    sget v1, Lcom/facebook/o;->short_name_wrapper:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {p1, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 35
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/user/User;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
