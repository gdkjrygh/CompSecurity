.class final Lkik/android/widget/preferences/ay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/NotifyNewPeoplePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/NotifyNewPeoplePreference;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lkik/android/widget/preferences/ay;->a:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 112
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 113
    return-void
.end method
