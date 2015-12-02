.class public Lcom/facebook/bugreporter/f;
.super Ljava/lang/Object;
.source "BugReportUploader.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/http/protocol/aq;

.field private final d:Lcom/facebook/bugreporter/d;

.field private final e:Lcom/facebook/common/e/h;

.field private final f:Landroid/app/NotificationManager;

.field private final g:Lcom/facebook/bugreporter/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/facebook/bugreporter/f;

    sput-object v0, Lcom/facebook/bugreporter/f;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/http/protocol/aq;Lcom/facebook/bugreporter/d;Lcom/facebook/common/e/h;Landroid/app/NotificationManager;Lcom/facebook/bugreporter/m;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/facebook/bugreporter/f;->b:Landroid/content/Context;

    .line 55
    iput-object p2, p0, Lcom/facebook/bugreporter/f;->c:Lcom/facebook/http/protocol/aq;

    .line 56
    iput-object p3, p0, Lcom/facebook/bugreporter/f;->d:Lcom/facebook/bugreporter/d;

    .line 57
    iput-object p4, p0, Lcom/facebook/bugreporter/f;->e:Lcom/facebook/common/e/h;

    .line 58
    iput-object p5, p0, Lcom/facebook/bugreporter/f;->f:Landroid/app/NotificationManager;

    .line 59
    iput-object p6, p0, Lcom/facebook/bugreporter/f;->g:Lcom/facebook/bugreporter/m;

    .line 60
    return-void
.end method

.method private a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 136
    if-nez p1, :cond_0

    .line 137
    const-string v0, ""

    .line 147
    :goto_0
    return-object v0

    .line 140
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/net/URI;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 141
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/b/f;->b(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    goto :goto_0

    .line 142
    :catch_0
    move-exception v0

    .line 143
    const-string v1, "Invalid file"

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 144
    const-string v0, ""

    goto :goto_0

    .line 145
    :catch_1
    move-exception v0

    .line 146
    const-string v1, "Failed to laod file"

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    const-string v0, ""

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 131
    sget-object v0, Lcom/facebook/bugreporter/f;->a:Ljava/lang/Class;

    invoke-static {v0, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/facebook/bugreporter/f;->e:Lcom/facebook/common/e/h;

    sget-object v1, Lcom/facebook/bugreporter/f;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/bugreporter/BugReport;Lcom/facebook/bugreporter/l;)V
    .locals 13

    .prologue
    .line 63
    new-instance v5, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v5, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 65
    const-string v0, "log"

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->c()Landroid/net/Uri;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/bugreporter/f;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 67
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v2

    .line 68
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->d()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 69
    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->d()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v2

    .line 71
    :cond_0
    new-instance v0, Lcom/facebook/bugreporter/e;

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->e()Lcom/google/common/a/ev;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->f()Lcom/google/common/a/ev;

    move-result-object v4

    invoke-virtual {v5}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->i()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->j()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->k()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->l()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->m()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->n()Ljava/lang/String;

    move-result-object v12

    invoke-direct/range {v0 .. v12}, Lcom/facebook/bugreporter/e;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Lcom/google/common/a/ev;Lcom/google/common/a/ev;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const/4 v1, 0x0

    .line 88
    :try_start_0
    iget-object v2, p0, Lcom/facebook/bugreporter/f;->c:Lcom/facebook/http/protocol/aq;

    iget-object v3, p0, Lcom/facebook/bugreporter/f;->d:Lcom/facebook/bugreporter/d;

    invoke-interface {v2, v3, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 94
    :goto_0
    if-eqz v0, :cond_1

    .line 95
    iget-object v0, p0, Lcom/facebook/bugreporter/f;->g:Lcom/facebook/bugreporter/m;

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->a()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/m;->b(Landroid/net/Uri;)V

    .line 128
    :goto_1
    return-void

    .line 89
    :catch_0
    move-exception v0

    .line 90
    const-string v2, "Error running SingleMethodRunner: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/bugreporter/f;->a(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    .line 98
    :cond_1
    const-string v0, "Failed to upload bug report."

    invoke-direct {p0, v0}, Lcom/facebook/bugreporter/f;->a(Ljava/lang/String;)V

    .line 99
    new-instance v1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/facebook/bugreporter/f;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/bugreporter/activity/BugReportActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 100
    const-string v0, "report"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 101
    const-string v0, "reporter_config"

    invoke-static {p2}, Lcom/facebook/bugreporter/ConstBugReporterConfig;->a(Lcom/facebook/bugreporter/l;)Lcom/facebook/bugreporter/ConstBugReporterConfig;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 104
    const-string v0, "retry"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 106
    iget-object v0, p0, Lcom/facebook/bugreporter/f;->b:Landroid/content/Context;

    sget v2, Lcom/facebook/o;->bug_report_fail_title:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/facebook/bugreporter/BugReport;->b()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 108
    invoke-static {}, Lcom/facebook/base/b;->a()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 109
    const-string v2, "%s - beta"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 112
    :cond_2
    new-instance v2, Landroid/support/v4/app/ap;

    iget-object v3, p0, Lcom/facebook/bugreporter/f;->b:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/support/v4/app/ap;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Landroid/support/v4/app/ap;->a(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/bugreporter/f;->b:Landroid/content/Context;

    sget v3, Lcom/facebook/o;->bug_report_fail_text:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/support/v4/app/ap;->b(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v0

    const v2, 0x108008a

    invoke-virtual {v0, v2}, Landroid/support/v4/app/ap;->a(I)Landroid/support/v4/app/ap;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/support/v4/app/ap;->b(Z)Landroid/support/v4/app/ap;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/bugreporter/f;->b:Landroid/content/Context;

    sget v3, Lcom/facebook/o;->bug_report_fail_ticker:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/support/v4/app/ap;->c(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/app/ap;->a(J)Landroid/support/v4/app/ap;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/bugreporter/f;->b:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    long-to-int v3, v3

    const/high16 v4, 0x10000000

    invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ap;->a(Landroid/app/PendingIntent;)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/ap;->b()Landroid/app/Notification;

    move-result-object v0

    .line 126
    iget-object v1, p0, Lcom/facebook/bugreporter/f;->f:Landroid/app/NotificationManager;

    const v2, 0xc350

    invoke-virtual {v1, v2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto/16 :goto_1
.end method
