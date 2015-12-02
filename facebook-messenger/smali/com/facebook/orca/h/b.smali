.class public Lcom/facebook/orca/h/b;
.super Ljava/lang/Object;
.source "LogReportSender.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/c/s;

.field private final c:Lcom/facebook/orca/h/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/c/s;Lcom/facebook/orca/h/a;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/orca/h/b;->a:Landroid/content/Context;

    .line 29
    iput-object p2, p0, Lcom/facebook/orca/h/b;->b:Lcom/facebook/c/s;

    .line 30
    iput-object p3, p0, Lcom/facebook/orca/h/b;->c:Lcom/facebook/orca/h/a;

    .line 31
    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/h/b;->c:Lcom/facebook/orca/h/a;

    invoke-virtual {v0}, Lcom/facebook/orca/h/a;->a()Lcom/facebook/common/c/f;

    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 53
    :goto_0
    return-void

    .line 38
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/common/c/f;->a()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    const-string v3, "From file: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/common/c/f;->a()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    new-instance v0, Landroid/content/Intent;

    const-string v3, "android.intent.action.SEND"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 45
    const-string v3, "text/html"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    const-string v3, "android.intent.extra.EMAIL"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, "orca-crashes@lists.facebook.com"

    aput-object v6, v4, v5

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    const-string v3, "android.intent.extra.SUBJECT"

    const-string v4, "Android Error Report"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 49
    const-string v3, "android.intent.extra.TEXT"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    const-string v2, "android.intent.extra.STREAM"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 51
    const-string v1, "Email Report"

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    .line 52
    iget-object v1, p0, Lcom/facebook/orca/h/b;->b:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/orca/h/b;->a:Landroid/content/Context;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_0
.end method
