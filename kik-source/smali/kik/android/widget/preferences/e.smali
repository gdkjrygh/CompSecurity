.class final Lkik/android/widget/preferences/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/DeveloperModePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/DeveloperModePreference;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lkik/android/widget/preferences/e;->a:Lkik/android/widget/preferences/DeveloperModePreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 43
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 44
    return-void
.end method
