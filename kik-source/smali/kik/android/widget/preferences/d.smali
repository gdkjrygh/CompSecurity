.class final Lkik/android/widget/preferences/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/CopyrightPreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/CopyrightPreference;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lkik/android/widget/preferences/d;->a:Lkik/android/widget/preferences/CopyrightPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 38
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 39
    return-void
.end method
