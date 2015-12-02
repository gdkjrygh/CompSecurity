.class Lcom/qihoo/security/appbox/c/a/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/toolbox/g$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/c/a/b;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/c/a/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/c/a/b;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/qihoo/security/appbox/c/a/b$1;->a:Lcom/qihoo/security/appbox/c/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/volley/VolleyError;)V
    .locals 0

    .prologue
    .line 139
    return-void
.end method

.method public a(Lcom/android/volley/toolbox/g$c;Z)V
    .locals 3

    .prologue
    .line 143
    if-nez p1, :cond_0

    .line 144
    invoke-static {}, Lcom/qihoo/security/appbox/c/a/b;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "imagecontainer = null "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    :cond_0
    return-void
.end method
