.class public Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;
.super Ljava/lang/Object;
.source "ContactFinder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FindOption"
.end annotation


# instance fields
.field public mSortOrder:Ljava/lang/String;

.field public mWhere:Ljava/lang/String;

.field public mWhereArgs:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "where"    # Ljava/lang/String;
    .param p2, "whereArgs"    # [Ljava/lang/String;
    .param p3, "sortOrder"    # Ljava/lang/String;

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;->mWhere:Ljava/lang/String;

    .line 56
    iput-object p2, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;->mWhereArgs:[Ljava/lang/String;

    .line 57
    iput-object p3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;->mSortOrder:Ljava/lang/String;

    .line 58
    return-void
.end method
