.class final Lkik/android/widget/preferences/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/KikCheckBoxPreference;

.field final synthetic b:Lkik/android/widget/preferences/DeveloperModePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/DeveloperModePreference;Lkik/android/widget/preferences/KikCheckBoxPreference;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lkik/android/widget/preferences/f;->b:Lkik/android/widget/preferences/DeveloperModePreference;

    iput-object p2, p0, Lkik/android/widget/preferences/f;->a:Lkik/android/widget/preferences/KikCheckBoxPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/widget/preferences/f;->a:Lkik/android/widget/preferences/KikCheckBoxPreference;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/widget/preferences/KikCheckBoxPreference;->setChecked(Z)V

    .line 38
    return-void
.end method
