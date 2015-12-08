.class final Lkik/android/widget/preferences/bh;
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
    .line 51
    iput-object p1, p0, Lkik/android/widget/preferences/bh;->a:Lkik/android/widget/preferences/ResetKikPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 55
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 56
    return-void
.end method
