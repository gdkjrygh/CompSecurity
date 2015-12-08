.class public Lroboguice/inject/SharedPreferencesProvider$PreferencesNameHolder;
.super Ljava/lang/Object;
.source "SharedPreferencesProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lroboguice/inject/SharedPreferencesProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PreferencesNameHolder"
.end annotation


# instance fields
.field protected value:Ljava/lang/String;
    .annotation runtime Lcom/google/inject/Inject;
        optional = true
    .end annotation

    .annotation runtime Lroboguice/inject/SharedPreferencesName;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
