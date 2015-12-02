.class Lcom/facebook/orca/prefs/m;
.super Ljava/lang/Object;
.source "LocationServicesPreference.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/l;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/l;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/orca/prefs/m;->a:Lcom/facebook/orca/prefs/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/prefs/m;->a:Lcom/facebook/orca/prefs/l;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/prefs/l;->a(Lcom/facebook/orca/prefs/l;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 105
    return-void
.end method
