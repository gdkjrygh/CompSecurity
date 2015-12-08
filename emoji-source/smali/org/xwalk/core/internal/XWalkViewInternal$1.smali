.class Lorg/xwalk/core/internal/XWalkViewInternal$1;
.super Ljava/lang/Object;
.source "XWalkViewInternal.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkViewInternal;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkViewInternal;

.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$err:Ljava/lang/UnsatisfiedLinkError;

.field final synthetic val$packageName:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkViewInternal;Ljava/lang/String;Ljava/lang/UnsatisfiedLinkError;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 314
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkViewInternal$1;->this$0:Lorg/xwalk/core/internal/XWalkViewInternal;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkViewInternal$1;->val$packageName:Ljava/lang/String;

    iput-object p3, p0, Lorg/xwalk/core/internal/XWalkViewInternal$1;->val$err:Ljava/lang/UnsatisfiedLinkError;

    iput-object p4, p0, Lorg/xwalk/core/internal/XWalkViewInternal$1;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 8
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    const/4 v7, 0x0

    .line 317
    new-instance v3, Landroid/app/ApplicationErrorReport;

    invoke-direct {v3}, Landroid/app/ApplicationErrorReport;-><init>()V

    .line 318
    .local v3, "report":Landroid/app/ApplicationErrorReport;
    const/4 v6, 0x1

    iput v6, v3, Landroid/app/ApplicationErrorReport;->type:I

    .line 319
    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkViewInternal$1;->val$packageName:Ljava/lang/String;

    iput-object v6, v3, Landroid/app/ApplicationErrorReport;->processName:Ljava/lang/String;

    iput-object v6, v3, Landroid/app/ApplicationErrorReport;->packageName:Ljava/lang/String;

    .line 321
    new-instance v0, Landroid/app/ApplicationErrorReport$CrashInfo;

    invoke-direct {v0}, Landroid/app/ApplicationErrorReport$CrashInfo;-><init>()V

    .line 323
    .local v0, "crash":Landroid/app/ApplicationErrorReport$CrashInfo;
    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkViewInternal$1;->val$err:Ljava/lang/UnsatisfiedLinkError;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Landroid/app/ApplicationErrorReport$CrashInfo;->exceptionClassName:Ljava/lang/String;

    .line 324
    const-string v6, "CPU architecture mismatch"

    iput-object v6, v0, Landroid/app/ApplicationErrorReport$CrashInfo;->exceptionMessage:Ljava/lang/String;

    .line 325
    new-instance v5, Ljava/io/StringWriter;

    invoke-direct {v5}, Ljava/io/StringWriter;-><init>()V

    .line 326
    .local v5, "writer":Ljava/io/StringWriter;
    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 327
    .local v2, "print":Ljava/io/PrintWriter;
    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkViewInternal$1;->val$err:Ljava/lang/UnsatisfiedLinkError;

    invoke-virtual {v6, v2}, Ljava/lang/UnsatisfiedLinkError;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 328
    invoke-virtual {v5}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Landroid/app/ApplicationErrorReport$CrashInfo;->stackTrace:Ljava/lang/String;

    .line 329
    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkViewInternal$1;->val$err:Ljava/lang/UnsatisfiedLinkError;

    invoke-virtual {v6}, Ljava/lang/UnsatisfiedLinkError;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v6

    aget-object v4, v6, v7

    .line 330
    .local v4, "stack":Ljava/lang/StackTraceElement;
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Landroid/app/ApplicationErrorReport$CrashInfo;->throwClassName:Ljava/lang/String;

    .line 331
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Landroid/app/ApplicationErrorReport$CrashInfo;->throwFileName:Ljava/lang/String;

    .line 332
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v6

    iput v6, v0, Landroid/app/ApplicationErrorReport$CrashInfo;->throwLineNumber:I

    .line 333
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Landroid/app/ApplicationErrorReport$CrashInfo;->throwMethodName:Ljava/lang/String;

    .line 335
    iput-object v0, v3, Landroid/app/ApplicationErrorReport;->crashInfo:Landroid/app/ApplicationErrorReport$CrashInfo;

    .line 336
    iput-boolean v7, v3, Landroid/app/ApplicationErrorReport;->systemApp:Z

    .line 337
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, v3, Landroid/app/ApplicationErrorReport;->time:J

    .line 339
    new-instance v1, Landroid/content/Intent;

    const-string v6, "android.intent.action.APP_ERROR"

    invoke-direct {v1, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 340
    .local v1, "intent":Landroid/content/Intent;
    const-string v6, "android.intent.extra.BUG_REPORT"

    invoke-virtual {v1, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 341
    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkViewInternal$1;->val$activity:Landroid/app/Activity;

    invoke-virtual {v6, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 342
    iget-object v6, p0, Lorg/xwalk/core/internal/XWalkViewInternal$1;->val$activity:Landroid/app/Activity;

    invoke-virtual {v6}, Landroid/app/Activity;->finish()V

    .line 343
    return-void
.end method
