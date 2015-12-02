.class Lcom/facebook/bugreporter/activity/d;
.super Landroid/support/v4/app/DialogFragment;
.source "BugReportActivity.java"


# instance fields
.field final synthetic Z:Lcom/facebook/bugreporter/activity/BugReportActivity;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/activity/BugReportActivity;)V
    .locals 0

    .prologue
    .line 287
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/d;->Z:Lcom/facebook/bugreporter/activity/BugReportActivity;

    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/activity/BugReportActivity;Lcom/facebook/bugreporter/activity/c;)V
    .locals 0

    .prologue
    .line 287
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/activity/d;-><init>(Lcom/facebook/bugreporter/activity/BugReportActivity;)V

    return-void
.end method


# virtual methods
.method public c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 291
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/d;->n()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/facebook/o;->bug_report_old_version_title:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->bug_report_old_version_text:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->dialog_yes:I

    new-instance v2, Lcom/facebook/bugreporter/activity/f;

    invoke-direct {v2, p0}, Lcom/facebook/bugreporter/activity/f;-><init>(Lcom/facebook/bugreporter/activity/d;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->dialog_no:I

    new-instance v2, Lcom/facebook/bugreporter/activity/e;

    invoke-direct {v2, p0}, Lcom/facebook/bugreporter/activity/e;-><init>(Lcom/facebook/bugreporter/activity/d;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method
