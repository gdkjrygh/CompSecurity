.class final Lcom/cleanmaster/ui/app/utils/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/ui/app/market/n;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/cleanmaster/ui/app/utils/a;


# direct methods
.method constructor <init>(Lcom/cleanmaster/ui/app/utils/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/cleanmaster/ui/app/utils/b;->b:Lcom/cleanmaster/ui/app/utils/a;

    iput-object p2, p0, Lcom/cleanmaster/ui/app/utils/b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 165
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/b;->b:Lcom/cleanmaster/ui/app/utils/a;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/utils/a;->a(Lcom/cleanmaster/ui/app/utils/a;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/ui/app/utils/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/b;->b:Lcom/cleanmaster/ui/app/utils/a;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/utils/b;->a:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/cleanmaster/ui/app/utils/a;->a(Lcom/cleanmaster/ui/app/utils/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/b;->b:Lcom/cleanmaster/ui/app/utils/a;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/utils/a;->b(Lcom/cleanmaster/ui/app/utils/a;)V

    .line 171
    return-void
.end method
