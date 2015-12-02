.class public Lcom/facebook/ui/i/g;
.super Ljava/lang/Object;
.source "Toaster.java"


# instance fields
.field private a:Lcom/facebook/ui/i/b;

.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/ui/i/b;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p2, p0, Lcom/facebook/ui/i/g;->a:Lcom/facebook/ui/i/b;

    .line 19
    iput-object p1, p0, Lcom/facebook/ui/i/g;->b:Landroid/content/Context;

    .line 20
    return-void
.end method

.method private static a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 197
    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    .line 198
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    .line 199
    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 57
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-static {}, Lcom/facebook/ui/i/g;->a()Ljava/lang/String;

    move-result-object v5

    .line 59
    const/4 v2, 0x0

    move-object v0, p0

    move-object v4, v3

    invoke-static/range {v0 .. v5}, Lcom/facebook/ui/i/g;->a(Landroid/content/Context;Ljava/lang/CharSequence;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/CharSequence;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 167
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v3, 0x3c

    if-le v1, v3, :cond_1

    move v1, v0

    .line 168
    :goto_0
    if-eqz v1, :cond_2

    move v1, v0

    .line 169
    :goto_1
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v3, Lcom/facebook/ui/i/b;

    invoke-virtual {v0, v3}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/i/b;

    .line 170
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 171
    if-eqz p2, :cond_0

    .line 172
    invoke-virtual {v1, p2, v2, v2}, Landroid/widget/Toast;->setGravity(III)V

    .line 175
    :cond_0
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 176
    invoke-virtual {v0, p1, p4, p3, p5}, Lcom/facebook/ui/i/b;->a(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    return-void

    :cond_1
    move v1, v2

    .line 167
    goto :goto_0

    :cond_2
    move v1, v2

    .line 168
    goto :goto_1
.end method


# virtual methods
.method public a(Lcom/facebook/ui/i/a;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 28
    invoke-virtual {p1}, Lcom/facebook/ui/i/a;->a()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ui/i/g;->b:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/facebook/ui/i/a;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 33
    :goto_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v3, 0x3c

    if-le v1, v3, :cond_2

    const/4 v1, 0x1

    .line 34
    :goto_1
    iget-object v3, p0, Lcom/facebook/ui/i/g;->b:Landroid/content/Context;

    invoke-static {v3, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 35
    invoke-virtual {p1}, Lcom/facebook/ui/i/a;->c()I

    move-result v3

    if-eqz v3, :cond_0

    .line 36
    invoke-virtual {p1}, Lcom/facebook/ui/i/a;->c()I

    move-result v3

    invoke-virtual {v1, v3, v2, v2}, Landroid/widget/Toast;->setGravity(III)V

    .line 38
    :cond_0
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 40
    iget-object v2, p0, Lcom/facebook/ui/i/g;->a:Lcom/facebook/ui/i/b;

    invoke-virtual {p1}, Lcom/facebook/ui/i/a;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/ui/i/a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/facebook/ui/i/a;->f()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-static {}, Lcom/facebook/ui/i/g;->a()Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v2, v0, v3, v4, v1}, Lcom/facebook/ui/i/b;->a(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    return-void

    .line 28
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/ui/i/a;->a()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_2
    move v1, v2

    .line 33
    goto :goto_1

    .line 40
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/ui/i/a;->f()Ljava/lang/String;

    move-result-object v1

    goto :goto_2
.end method
