.class final Lkik/android/f/a/y;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/app/ProgressDialog;

.field final synthetic b:Lkik/android/f/a/w;


# direct methods
.method constructor <init>(Lkik/android/f/a/w;Landroid/app/ProgressDialog;)V
    .locals 0

    .prologue
    .line 991
    iput-object p1, p0, Lkik/android/f/a/y;->b:Lkik/android/f/a/w;

    iput-object p2, p0, Lkik/android/f/a/y;->a:Landroid/app/ProgressDialog;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 995
    iget-object v0, p0, Lkik/android/f/a/y;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 996
    return-void
.end method
