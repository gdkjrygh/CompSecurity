.class final Lkik/android/f/a/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/app/ProgressDialog;

.field final synthetic b:Lkik/android/f/a/w;


# direct methods
.method constructor <init>(Lkik/android/f/a/w;Landroid/app/ProgressDialog;)V
    .locals 0

    .prologue
    .line 984
    iput-object p1, p0, Lkik/android/f/a/x;->b:Lkik/android/f/a/w;

    iput-object p2, p0, Lkik/android/f/a/x;->a:Landroid/app/ProgressDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 988
    iget-object v0, p0, Lkik/android/f/a/x;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 989
    return-void
.end method
