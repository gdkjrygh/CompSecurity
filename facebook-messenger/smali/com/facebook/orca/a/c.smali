.class public Lcom/facebook/orca/a/c;
.super Ljava/lang/Object;
.source "MessagesQuickExperimentNameHolder.java"

# interfaces
.implements Lcom/facebook/abtest/qe/f/b;


# instance fields
.field private final a:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/abtest/qe/f/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 11

    .prologue
    const/4 v10, 0x0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Lcom/facebook/abtest/qe/f/a;

    const-string v1, "android_messenger_send_message_parameters"

    invoke-direct {v0, v1, v10}, Lcom/facebook/abtest/qe/f/a;-><init>(Ljava/lang/String;Z)V

    new-instance v1, Lcom/facebook/abtest/qe/f/a;

    const-string v2, "messaging_composer_text"

    invoke-direct {v1, v2, v10}, Lcom/facebook/abtest/qe/f/a;-><init>(Ljava/lang/String;Z)V

    new-instance v2, Lcom/facebook/abtest/qe/f/a;

    const-string v3, "wildfire_presence_android"

    invoke-direct {v2, v3, v10}, Lcom/facebook/abtest/qe/f/a;-><init>(Ljava/lang/String;Z)V

    new-instance v3, Lcom/facebook/abtest/qe/f/a;

    const-string v4, "android_messenger_rich_presence"

    invoke-direct {v3, v4, v10}, Lcom/facebook/abtest/qe/f/a;-><init>(Ljava/lang/String;Z)V

    new-instance v4, Lcom/facebook/abtest/qe/f/a;

    const-string v5, "android_divebar_badging"

    invoke-direct {v4, v5, v10}, Lcom/facebook/abtest/qe/f/a;-><init>(Ljava/lang/String;Z)V

    new-instance v5, Lcom/facebook/abtest/qe/f/a;

    const-string v6, "messenger_group_name_upsell"

    invoke-direct {v5, v6, v10}, Lcom/facebook/abtest/qe/f/a;-><init>(Ljava/lang/String;Z)V

    const/4 v6, 0x3

    new-array v6, v6, [Lcom/facebook/abtest/qe/f/a;

    new-instance v7, Lcom/facebook/abtest/qe/f/a;

    const-string v8, "messenger_mobile_presence_icon_master"

    invoke-direct {v7, v8, v10}, Lcom/facebook/abtest/qe/f/a;-><init>(Ljava/lang/String;Z)V

    aput-object v7, v6, v10

    const/4 v7, 0x1

    new-instance v8, Lcom/facebook/abtest/qe/f/a;

    const-string v9, "orca_send_receipts"

    invoke-direct {v8, v9, v10}, Lcom/facebook/abtest/qe/f/a;-><init>(Ljava/lang/String;Z)V

    aput-object v8, v6, v7

    const/4 v7, 0x2

    new-instance v8, Lcom/facebook/abtest/qe/f/a;

    const-string v9, "android_messenger_context_menu_entry_point"

    invoke-direct {v8, v9, v10}, Lcom/facebook/abtest/qe/f/a;-><init>(Ljava/lang/String;Z)V

    aput-object v8, v6, v7

    invoke-static/range {v0 .. v6}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/a/c;->a:Lcom/google/common/a/fi;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/abtest/qe/f/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/a/c;->a:Lcom/google/common/a/fi;

    return-object v0
.end method
