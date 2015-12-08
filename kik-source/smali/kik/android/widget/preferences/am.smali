.class final Lkik/android/widget/preferences/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/LicensePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/LicensePreference;)V
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lkik/android/widget/preferences/am;->a:Lkik/android/widget/preferences/LicensePreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 31
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 32
    return-void
.end method
