.class public Lcom/facebook/zero/ui/l;
.super Ljava/lang/Object;
.source "ExtraChargesDialogController.java"


# instance fields
.field private final a:Landroid/content/res/Resources;

.field private final b:Lcom/facebook/zero/ui/o;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Lcom/facebook/zero/ui/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/facebook/zero/ui/o;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/zero/ui/l;->a:Landroid/content/res/Resources;

    .line 49
    iput-object p2, p0, Lcom/facebook/zero/ui/l;->b:Lcom/facebook/zero/ui/o;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/zero/ui/l;->c:Ljava/util/Map;

    .line 51
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/zero/ui/l;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->zero_generic_extra_data_charges_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;
    .locals 2

    .prologue
    .line 81
    new-instance v0, Lcom/facebook/zero/ui/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/zero/ui/n;-><init>(Lcom/facebook/zero/ui/l;Lcom/facebook/zero/ui/m;)V

    .line 82
    iput-object p1, v0, Lcom/facebook/zero/ui/n;->a:Lcom/facebook/prefs/shared/ae;

    .line 83
    iput-object p2, v0, Lcom/facebook/zero/ui/n;->b:Ljava/lang/String;

    .line 84
    iput-object p3, v0, Lcom/facebook/zero/ui/n;->c:Ljava/lang/String;

    .line 85
    iput-object p4, v0, Lcom/facebook/zero/ui/n;->d:Lcom/facebook/zero/ui/k;

    .line 87
    iget-object v1, p0, Lcom/facebook/zero/ui/l;->c:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    return-object p0
.end method

.method public a(Landroid/support/v4/app/q;)V
    .locals 3

    .prologue
    .line 139
    iget-object v0, p0, Lcom/facebook/zero/ui/l;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 140
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/ae;

    invoke-static {v1}, Lcom/facebook/zero/a/c;->a(Lcom/facebook/prefs/shared/ae;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/facebook/zero/ui/ExtraChargesDialog;

    .line 142
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/n;

    iget-object v0, v0, Lcom/facebook/zero/ui/n;->d:Lcom/facebook/zero/ui/k;

    .line 143
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 147
    invoke-virtual {v1, v0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->a(Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/ExtraChargesDialog;

    goto :goto_0

    .line 149
    :cond_1
    return-void
.end method

.method public a(Lcom/facebook/prefs/shared/ae;Landroid/support/v4/app/q;)V
    .locals 1

    .prologue
    .line 98
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Landroid/support/v4/app/q;Landroid/os/Parcelable;)V

    .line 99
    return-void
.end method

.method public a(Lcom/facebook/prefs/shared/ae;Landroid/support/v4/app/q;Landroid/os/Parcelable;)V
    .locals 5
    .param p3    # Landroid/os/Parcelable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/zero/ui/l;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/n;

    .line 110
    if-nez v0, :cond_1

    .line 130
    :cond_0
    :goto_0
    return-void

    .line 114
    :cond_1
    iget-object v1, p0, Lcom/facebook/zero/ui/l;->b:Lcom/facebook/zero/ui/o;

    invoke-virtual {v1, p1}, Lcom/facebook/zero/ui/o;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 115
    new-instance v1, Lcom/facebook/zero/ui/ExtraChargesDialog;

    iget-object v2, v0, Lcom/facebook/zero/ui/n;->a:Lcom/facebook/prefs/shared/ae;

    iget-object v3, v0, Lcom/facebook/zero/ui/n;->b:Ljava/lang/String;

    iget-object v4, v0, Lcom/facebook/zero/ui/n;->c:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/zero/ui/ExtraChargesDialog;-><init>(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lcom/facebook/zero/ui/ExtraChargesDialog;->a(Landroid/os/Parcelable;)Lcom/facebook/zero/ui/ExtraChargesDialog;

    move-result-object v1

    iget-object v0, v0, Lcom/facebook/zero/ui/n;->d:Lcom/facebook/zero/ui/k;

    invoke-virtual {v1, v0}, Lcom/facebook/zero/ui/ExtraChargesDialog;->a(Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/ExtraChargesDialog;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/zero/a/c;->a(Lcom/facebook/prefs/shared/ae;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lcom/facebook/zero/ui/ExtraChargesDialog;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    goto :goto_0

    .line 123
    :cond_2
    iget-object v0, v0, Lcom/facebook/zero/ui/n;->d:Lcom/facebook/zero/ui/k;

    .line 124
    if-eqz v0, :cond_0

    .line 128
    invoke-interface {v0, p3}, Lcom/facebook/zero/ui/k;->a(Landroid/os/Parcelable;)V

    goto :goto_0
.end method
