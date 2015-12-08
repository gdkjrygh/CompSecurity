.class final Lcom/cleanmaster/ui/app/market/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/cleanmaster/ui/app/market/k;


# direct methods
.method constructor <init>(Lcom/cleanmaster/ui/app/market/k;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/l;->b:Lcom/cleanmaster/ui/app/market/k;

    iput-object p2, p0, Lcom/cleanmaster/ui/app/market/l;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 168
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/l;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/l;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/l;->b:Lcom/cleanmaster/ui/app/market/k;

    iget-object v0, v0, Lcom/cleanmaster/ui/app/market/k;->d:Lcom/cleanmaster/ui/app/market/i;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/l;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/cleanmaster/ui/app/market/i;->a(Lcom/cleanmaster/ui/app/market/i;Ljava/lang/String;)V

    .line 180
    :goto_0
    return-void

    .line 171
    :cond_1
    new-instance v0, Lcom/cleanmaster/ui/app/market/o;

    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/cleanmaster/ui/app/market/o;-><init>(Landroid/content/Context;)V

    .line 172
    new-instance v1, Lcom/cleanmaster/ui/app/market/m;

    invoke-direct {v1, p0}, Lcom/cleanmaster/ui/app/market/m;-><init>(Lcom/cleanmaster/ui/app/market/l;)V

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/o;->a(Lcom/cleanmaster/ui/app/market/r;)V

    .line 178
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/l;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/cleanmaster/ui/app/market/l;->b:Lcom/cleanmaster/ui/app/market/k;

    iget-object v2, v2, Lcom/cleanmaster/ui/app/market/k;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/cleanmaster/ui/app/market/l;->b:Lcom/cleanmaster/ui/app/market/k;

    iget-object v3, v3, Lcom/cleanmaster/ui/app/market/k;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/cleanmaster/ui/app/market/l;->b:Lcom/cleanmaster/ui/app/market/k;

    iget-object v4, v4, Lcom/cleanmaster/ui/app/market/k;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/cleanmaster/ui/app/market/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
