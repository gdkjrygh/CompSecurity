.class final Lkik/android/widget/preferences/bi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/ResetKikPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/ResetKikPreference;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lkik/android/widget/preferences/bi;->a:Lkik/android/widget/preferences/ResetKikPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lkik/android/widget/preferences/bi;->a:Lkik/android/widget/preferences/ResetKikPreference;

    iget-object v0, v0, Lkik/android/widget/preferences/ResetKikPreference;->b:Lkik/a/ab;

    invoke-interface {v0}, Lkik/a/ab;->f()V

    .line 50
    return-void
.end method
